package com.backspace.tech.models.txn;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DataLoadResponse {

  private String status;
  private String message;
  private int recordCount;
  private String query;
  private String errorDetails;
  private String fileType;
}
