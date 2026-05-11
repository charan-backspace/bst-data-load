package com.backspace.tech.models.txn;

import io.smallrye.common.constraint.NotNull;
import lombok.Data;
import org.jboss.resteasy.reactive.RestForm;
import org.jboss.resteasy.reactive.multipart.FileUpload;

@Data
public class ParseTransactionCSV {

  @NotNull
  @RestForm("file")
  FileUpload file;

  @NotNull
  @RestForm("file_type")
  String fileType;

}

