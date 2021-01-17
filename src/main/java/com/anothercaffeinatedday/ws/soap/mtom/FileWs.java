package com.anothercaffeinatedday.ws.soap.mtom;

import javax.activation.DataHandler;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Defines the methods on the MTOM FileWs.
 */
@WebService
public interface FileWs {
  /**
   * Upload the provided attachment.
   *
   * <p>The attachment, provided as a <code>file</code> parameter is uploaded per the implementation.
   *
   * @param attachment the object to be uploaded, as <code>file</code>.
   */
  void upload(@WebParam(name = "file") DataHandler attachment);

  DataHandler download();

}
