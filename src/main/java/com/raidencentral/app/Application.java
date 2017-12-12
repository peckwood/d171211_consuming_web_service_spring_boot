package com.raidencentral.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.raidencentral.app.wsdlartifact.Response;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner lookup(ContractStatusUpdateClient client) {
		return args -> {
			String contractNumber = "201711260011";

			/*if (args.length > 0) {
				contractNumber = args[0];
			}*/
			Response response = client.updateContractStatusToComplete(contractNumber);
			System.err.println(response.getStatus());
			System.err.println(response.getMsg());
		};
	}
}
