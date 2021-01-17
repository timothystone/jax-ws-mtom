package com.anothercaffeinatedday.ws.soap.mtom;

import javax.activation.DataHandler;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Defines the methods on the MTOM FileWs.
 */
@WebService
public interface FileWs {

  void upload(@WebParam(name = "file") DataHandler attachment);

  DataHandler download();

}
