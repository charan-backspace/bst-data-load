package org.backspace.csv;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface CsvReader {

  // TODO write properly later

  <T> List<T> parse(File file, Class<T> clazz) throws IOException;
}
