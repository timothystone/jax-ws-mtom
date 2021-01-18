package com.anothercaffeinatedday.ws.soap.config;

import com.anothercaffeinatedday.ws.soap.mtom.FileWsImpl;
import javax.xml.ws.Endpoint;
import javax.xml.ws.soap.SOAPBinding;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebServiceConfig {

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new FileWsImpl());
        endpoint.publish("/filews");

        SOAPBinding binding = (SOAPBinding) endpoint.getBinding();
        binding.setMTOMEnabled(true);

        return endpoint;
    }
}
