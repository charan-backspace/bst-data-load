package org.backspace.csv.exception;

public class ApacheCsvException extends RuntimeException {

  public ApacheCsvException(String message, Throwable throwable) {
    super(message, throwable);
  }

  public ApacheCsvException(String message) {
    super(message);
  }
}
