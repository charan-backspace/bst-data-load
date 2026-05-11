package com.backspace.tech.services;

import com.backspace.tech.constants.txn.CsvType;
import com.backspace.tech.constants.utils.CsvParsingUtils;
import com.backspace.tech.entities.AuthRaw;
import com.backspace.tech.entities.Iso8583;
import com.backspace.tech.entities.StatementRaw;
import com.backspace.tech.models.txn.DataLoadResponse;
import com.backspace.tech.models.txn.ParseTransactionCSV;
import com.backspace.tech.repositories.AuthRepository;
import com.backspace.tech.repositories.Iso8583Repository;
import com.backspace.tech.repositories.StatementRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.jboss.resteasy.reactive.multipart.FileUpload;

import java.io.File;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.logging.Logger;

@ApplicationScoped
public class TransactionParsingService {

  private static final Logger LOGGER = Logger.getLogger(TransactionParsingService.class.getName());

  private static final Set<String> TRIMMABLE_FIELDS = Set.of("ORIG_MSG_TYPE", "I002_NUMBER");

  @Inject
  CsvParsingUtils csvParsingUtils;

  @Inject
  AuthRepository authRepository;

  @Inject
  StatementRepository statementRepository;

  @Inject
  Iso8583Repository iso8583Repository;

  public DataLoadResponse parseTransactionData(ParseTransactionCSV parseTransactionCSV) {
    CsvType csvType = CsvType.fromString(parseTransactionCSV.getFileType());
    return processTransactionData(parseTransactionCSV.getFile(), csvType);
  }

  private DataLoadResponse processTransactionData(FileUpload file, CsvType csvType) {
    switch (csvType) {
      case BILLED:
        return processBilledData(file.uploadedFile().toFile(), csvType);
      case AUTH:
        return processAuthData(file.uploadedFile().toFile(), csvType);
      case ISO:
        return processIsoData(file.uploadedFile().toFile(), csvType);
      default:
        throw new IllegalArgumentException("Unsupported CSV type: " + csvType);
    }
  }


  public DataLoadResponse processBilledData(File csvFile, CsvType csvType) {
    List<StatementRaw> billedData = csvParsingUtils.parseBilledCsv(csvFile);
    // Trim fields
    billedData.forEach(f -> trimParsedFields(f));
    // Save to database
    statementRepository.saveAll(billedData);
    LOGGER.info("Processed " + billedData.size() + " billed records");

    // Extract SERNOs
    List<String> sernos = billedData.stream()
        .map(StatementRaw::getSERNO)
        .filter(s -> s != null && !s.isBlank())
        .collect(Collectors.toList());

    String query = buildQuery("public.statement_raw", "serno", sernos);

    return DataLoadResponse.builder()
        .status("success")
        .message("Successfully loaded " + billedData.size() + " billed records")
        .recordCount(billedData.size())
        .query(query)
        .fileType(csvType.getValue())
        .build();
  }


  public DataLoadResponse processAuthData(File csvFile, CsvType csvType) {
    List<AuthRaw> authData = csvParsingUtils.parseAuthCsv(csvFile);
    // Trim fields
    authData.forEach(f -> trimParsedFields(f));
    // Save to database
    authRepository.saveAll(authData);
    LOGGER.info("Processed " + authData.size() + " auth records");

    // Extract SERNOs
    List<String> sernos = authData.stream()
        .map(AuthRaw::getSERNO)
        .filter(s -> s != null && !s.isBlank())
        .collect(Collectors.toList());

    String query = buildQuery("public.auth_raw", "serno", sernos);

    return DataLoadResponse.builder()
        .status("success")
        .message("Successfully loaded " + authData.size() + " auth records")
        .recordCount(authData.size())
        .query(query)
        .fileType(csvType.getValue())
        .build();
  }


  public DataLoadResponse processIsoData(File csvFile, CsvType csvType) {
    List<Iso8583> isoData = csvParsingUtils.parseIsoCsv(csvFile);
    // Trim fields
    isoData.forEach(f -> trimParsedFields(f));
    // Save to database
    iso8583Repository.saveAll(isoData);
    LOGGER.info("Processed " + isoData.size() + " ISO records");

    // Extract TRXNSERNOs
    List<String> sernos = isoData.stream()
        .map(Iso8583::getTRXNSERNO)
        .filter(s -> s != null && !s.isBlank())
        .collect(Collectors.toList());

    String query = buildQuery("public.iso8583", "trxnserno", sernos);

    return DataLoadResponse.builder()
        .status("success")
        .message("Successfully loaded " + isoData.size() + " ISO records")
        .recordCount(isoData.size())
        .query(query)
        .fileType(csvType.getValue())
        .build();
  }

  private String buildQuery(String tableName, String columnName, List<String> values) {
    if (values.isEmpty()) {
      return "-- No records to query";
    }
    String inClause = values.stream()
        .map(v -> "'" + v + "'")
        .collect(Collectors.joining(","));
    return "SELECT * FROM " + tableName + "\nWHERE " + columnName + " IN (" + inClause + ")";
  }

  private void trimParsedFields(Object obj) {
    if (obj == null) {
      return;
    }

    Class<?> clazz = obj.getClass();
    try {
      for (Field field : clazz.getDeclaredFields()) {
        if (field.getType().equals(String.class) && TRIMMABLE_FIELDS.contains(field.getName())) {
          // Allow access to private fields
          field.setAccessible(true);
          String value = (String) field.get(obj);
          if (value != null) {
            field.set(obj, value.strip());
          }
        }
      }
    } catch (IllegalAccessException iae) {
      LOGGER.severe("Error trimming parsed fields: " + iae.getMessage());
      throw new RuntimeException("Failed to trim parsed fields", iae);
    }
  }
}
