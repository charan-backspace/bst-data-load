package com.backspace.tech.constants.txn;

 public enum CsvType {
  BILLED("billed"),
  AUTH("auth"),
  ISO("iso");

  private final String value;

  CsvType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static CsvType fromString(String type) {
    for (CsvType csvType : CsvType.values()) {
      if (csvType.value.equalsIgnoreCase(type)) {
        return csvType;
      }
    }
    throw new IllegalArgumentException("Unknown CSV type: " + type);
  }
}