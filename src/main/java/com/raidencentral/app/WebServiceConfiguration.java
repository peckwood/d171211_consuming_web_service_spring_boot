package com.raidencentral.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class WebServiceConfiguration {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("com.raidencentral.app.wsdlartifact");
		return marshaller;
	}

	@Bean
	public ContractStatusUpdateClient quoteClient(Jaxb2Marshaller marshaller) {
		ContractStatusUpdateClient client = new ContractStatusUpdateClient();
		client.setDefaultUri("http://localhost:8080/d171212_producing_web_service/ws/contract-status-update");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}