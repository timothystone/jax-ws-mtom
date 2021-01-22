package com.anothercaffeinatedday.ws.soap;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;

/**
 * The MTOM File Webservice Implementation.
 */
public class FileWsImpl implements FileWs {

  @Override
  public void upload(DataHandler attachment) {
    InputStream inputStream = null;
    OutputStream outputStream = null;
    try {
      inputStream = attachment.getInputStream();
      outputStream = new FileOutputStream("/Users/timothystone/Desktop/test.jpg");
      byte[] b = new byte[100000];
      int bytesRead = 0;
      while ((bytesRead = inputStream.read(b)) != -1) {
        outputStream.write(b, 0, bytesRead);
      }
    } catch (IOException ioe) {
      ioe.printStackTrace();
    } finally {
      try {
        inputStream.close();
        outputStream.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  public DataHandler download() {
    StringBuilder filename = new StringBuilder().append(System.getProperty("java.io.tmpdir")).append("test.jpg");
    return new DataHandler(new FileDataSource(new File(filename.toString())));
  }
}
