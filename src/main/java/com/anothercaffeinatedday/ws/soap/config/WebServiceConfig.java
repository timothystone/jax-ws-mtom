package com.anothercaffeinatedday.ws.soap.config;

import com.anothercaffeinatedday.ws.soap.FileWsImpl;
import javax.xml.ws.Endpoint;
import javax.xml.ws.soap.SOAPBinding;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The FileWsImpl configuration for Spring.
 *
 * <p>This class publishes the endpoint for the webservice and enables MTOM.</p>
 */
@Configuration
public class WebServiceConfig {

  @Autowired
  private Bus bus;

  /**
   * The WebService endpoint for FileWsImpl.
   *
   * <p>Set the endpoint URL and enable MTOM.</p>
   *
   * @return EndpointImpl
   *     the published endpoint of the FileWsImpl with MTOM.
   */
  @Bean
  public Endpoint endpoint() {
    EndpointImpl endpoint = new EndpointImpl(bus, new FileWsImpl());
    endpoint.publish("/filews");

    SOAPBinding binding = (SOAPBinding) endpoint.getBinding();
    binding.setMTOMEnabled(true);

    return endpoint;
  }
}
