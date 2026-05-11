package com.backspace.tech.controllers;

import com.backspace.tech.models.txn.DataLoadResponse;
import com.backspace.tech.models.txn.ParseTransactionCSV;
import com.backspace.tech.services.TransactionParsingService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.annotation.security.RolesAllowed;

import java.util.logging.Logger;

@Path("/transaction")
public class InquiryController {

  private static final Logger LOGGER = Logger.getLogger(InquiryController.class.getName());

  @Inject
  TransactionParsingService transactionParsingService;

  @POST
  @Path("/parse")
  @RolesAllowed("Admin")
  @Consumes(MediaType.MULTIPART_FORM_DATA)
  @Produces(MediaType.APPLICATION_JSON)
  public Response parseTransactionData(ParseTransactionCSV parseTransactionCSV) {
    try {
      DataLoadResponse result = transactionParsingService.parseTransactionData(parseTransactionCSV);
      return Response.ok(result).build();
    } catch (Exception e) {
      LOGGER.severe("Error processing file: " + e.getMessage());
      String errorMessage = parseErrorMessage(e);
      DataLoadResponse errorResponse = DataLoadResponse.builder()
          .status("error")
          .message(errorMessage)
          .errorDetails(getRootCauseMessage(e))
          .build();
      return Response.status(Response.Status.BAD_REQUEST).entity(errorResponse).build();
    }
  }

  private String parseErrorMessage(Exception e) {
    String fullMessage = getRootCauseMessage(e);

    // Duplicate key constraint violation
    if (fullMessage.contains("duplicate key value violates unique constraint")) {
      // Extract the key value from "Key (serno)=(xxx) already exists"
      int keyStart = fullMessage.indexOf("Key (");
      if (keyStart >= 0) {
        int detailEnd = fullMessage.indexOf(".", keyStart);
        String keyDetail = detailEnd > keyStart
            ? fullMessage.substring(keyStart, detailEnd)
            : fullMessage.substring(keyStart);
        return "Duplicate record found: " + keyDetail + ". The file contains records that already exist in the database.";
      }
      return "Duplicate record found. The file contains records that already exist in the database.";
    }

    // Date format parsing error
    if (fullMessage.contains("DateTimeParseException")
        || fullMessage.contains("could not be parsed")
        || fullMessage.contains("date format")
        || fullMessage.contains("Text '")) {
      return "Date format mismatch in the CSV file. Expected format: dd-MM-yyyy HH:mm:ss. Please check date columns in your file.";
    }

    // CSV parsing error
    if (fullMessage.contains("Error parsing") || fullMessage.contains("IOException")) {
      return "Failed to parse the CSV file. Please ensure the file is pipe-delimited (|) and has valid headers.";
    }

    // Unknown CSV type
    if (fullMessage.contains("Unknown CSV type") || fullMessage.contains("Unsupported CSV type")) {
      return "Invalid file type selected. Please choose ISO, BILLED, or AUTH.";
    }

    // Generic fallback
    return "An unexpected error occurred while processing the file: " + truncate(fullMessage, 200);
  }

  private String getRootCauseMessage(Throwable t) {
    StringBuilder sb = new StringBuilder();
    Throwable cause = t;
    while (cause != null) {
      if (cause.getMessage() != null) {
        sb.append(cause.getMessage()).append(" | ");
      }
      cause = cause.getCause();
    }
    return sb.toString();
  }

  private String truncate(String s, int maxLen) {
    if (s == null) return "";
    return s.length() <= maxLen ? s : s.substring(0, maxLen) + "...";
  }
}
