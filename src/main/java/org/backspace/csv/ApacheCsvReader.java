package org.backspace.csv;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.backspace.csv.annotation.CsvColumn;
import org.backspace.csv.exception.ApacheCsvException;

public class ApacheCsvReader implements CsvReader {


  private final boolean skipHeaderRow;
  private final char delimiter;

  public ApacheCsvReader(boolean skipHeaderRow, char delimiter) {
    this.skipHeaderRow = skipHeaderRow;
    this.delimiter = delimiter;
  }

  public ApacheCsvReader(boolean skipHeaderRow) {
    this.skipHeaderRow = skipHeaderRow;
    this.delimiter = ',';
  }

  @Override
  public <T> List<T> parse(File file, Class<T> clazz) throws IOException {
    Reader reader = new FileReader(file);
    CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
        .setAllowMissingColumnNames(false)
        .setHeader()
        .setDelimiter(this.delimiter)
        .setSkipHeaderRecord(this.skipHeaderRow)
        .setIgnoreEmptyLines(true)
        .setNullString("")
        .build();
    CSVParser parser = parse(csvFormat, reader);
    boolean areAllHeadersPresent = checkAllHeadersPresent(clazz, parser);
    if (!areAllHeadersPresent) {
      throw new ApacheCsvException(
          "Make sure the CSV file contains all needed headers");
    }

    List<T> instances = new ArrayList<>();
    for (CSVRecord record : parser.getRecords()) {
      T instance;
      try {
        instance = convertToCustomClass(record, clazz);
      } catch (InvocationTargetException | IllegalAccessException e) {
        throw new RuntimeException(e);
      }
      instances.add(instance);
    }
    parser.close();
    return instances;
  }

  private CSVParser parse(CSVFormat csvFormat, Reader reader)
      throws IOException {
    try {
      return CSVParser.parse(reader, csvFormat);
    } catch (IllegalArgumentException e) {
      throw new ApacheCsvException("Header name is missing in the CSV", e);
    }
  }

  private <T> boolean checkAllHeadersPresent(Class<T> clazz, CSVParser csvParser) {
    List<String> neededHeaders = new ArrayList<>();
    Field[] fields = clazz.getDeclaredFields();
    for (Field field : fields) {
      CsvColumn annotationCtx = field.getAnnotation(CsvColumn.class);
      if (annotationCtx == null) {
        continue;
      }
      String header = annotationCtx.name();
      neededHeaders.add(header);
    }

    List<String> csvHeaders = csvParser.getHeaderNames();
    return new HashSet<>(csvHeaders).containsAll(neededHeaders);
  }

  private <T> T convertToCustomClass(CSVRecord record, Class<T> clazz)
      throws InvocationTargetException, IllegalAccessException {
    T instance;
    try {
      instance = clazz.getConstructor().newInstance();
    } catch (NoSuchMethodException e) {
      throw new ApacheCsvException("Please declare a no-args public constructor", e);
    } catch (InstantiationException e) {
      throw new ApacheCsvException("Make sure " + clazz.getName() + " is not abstract", e);
    }

    Field[] fields = clazz.getDeclaredFields();
    for (Field field : fields) {
      CsvColumn annotationCtx = field.getAnnotation(CsvColumn.class);
      if (annotationCtx == null) {
        continue;
      }

      String header = annotationCtx.name();
      field.setAccessible(true);
      String value = record.get(header);

      if (Objects.isNull(value)) {
        field.set(instance, null);
        continue;
      }

      Class<?> type = field.getType();
      if (type.equals(String.class)) {
        field.set(instance, value);
      } else if (type.equals(Integer.TYPE) || type.equals(Integer.class)) {
        int integerValue = convertToInteger(value);
        field.set(instance, integerValue);
      } else if (type.equals(Double.TYPE) || type.equals(Double.class)) {
        double doubleValue = convertToDouble(value);
        field.set(instance, doubleValue);
      } else if (type.equals(LocalDateTime.class)) {
        LocalDateTime localDateTime = convertToLocalDateTime(value, annotationCtx.dateFormat());
        field.set(instance, localDateTime);
      } else if (type.equals(BigDecimal.class)) {
        BigDecimal bigDecimal = convertToBigDecimal(value);
        field.set(instance, bigDecimal);
      }
    }

    return instance;
  }

  private int convertToInteger(String value) {
    return Integer.parseInt(value);
  }

  private double convertToDouble(String value) {
    return Double.parseDouble(value);
  }

  private LocalDateTime convertToLocalDateTime(String value, String[] dateTimeFormats) {
    for (String dateTimeFormat : dateTimeFormats) {
      try {
        DateTimeFormatter dateTimeFormatter = new DateTimeFormatterBuilder()
            .parseCaseInsensitive()
            .appendPattern(dateTimeFormat)
            .toFormatter(Locale.ENGLISH);
        return LocalDateTime.parse(value, dateTimeFormatter);
      } catch (DateTimeParseException ignored) {
      }
    }

    throw new ApacheCsvException(
        "Date format does not match any given date format: " + Arrays.toString(dateTimeFormats));
  }

  private BigDecimal convertToBigDecimal(String value) {
    return new BigDecimal(value);
  }
}
