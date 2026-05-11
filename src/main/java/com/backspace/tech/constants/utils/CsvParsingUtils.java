package com.backspace.tech.constants.utils;

import com.backspace.tech.entities.AuthRaw;
import com.backspace.tech.entities.Iso8583;
import com.backspace.tech.entities.StatementRaw;
import jakarta.enterprise.context.ApplicationScoped;
import org.backspace.csv.ApacheCsvReader;
import org.backspace.csv.CsvReader;

import java.io.File;
import java.io.IOException;
import java.util.List;

@ApplicationScoped
public class CsvParsingUtils {

  /**
   * Type-safe parsing methods for each CSV type
   */
  public List<StatementRaw> parseBilledCsv(File file) {
    CsvReader reader = new ApacheCsvReader(true,'|');
    try {
      return reader.parse(file, StatementRaw.class);
    } catch (IOException e) {
      throw new RuntimeException("Error parsing billed CSV: " + e.getMessage(), e);
    }
  }

  public List<AuthRaw> parseAuthCsv(File file) {
    CsvReader reader = new ApacheCsvReader(true,'|');
    try {
      return reader.parse(file, AuthRaw.class);
    } catch (IOException e) {
      throw new RuntimeException("Error parsing auth CSV: " + e.getMessage(), e);
    }
  }

  public List<Iso8583> parseIsoCsv(File file) {
    CsvReader reader = new ApacheCsvReader(true,'|');
    try {
      return reader.parse(file, Iso8583.class);
    } catch (IOException e) {
      throw new RuntimeException("Error parsing ISO CSV: " + e.getMessage(), e);
    }
  }
}
