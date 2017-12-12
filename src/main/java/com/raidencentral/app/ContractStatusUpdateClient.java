package com.raidencentral.app;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.raidencentral.app.wsdlartifact.ContractStatusUpdateRequest;
import com.raidencentral.app.wsdlartifact.Response;

public class ContractStatusUpdateClient extends WebServiceGatewaySupport{
	//201711260011
	public Response updateContractStatusToComplete(String contractNumber){
		ContractStatusUpdateRequest request = new ContractStatusUpdateRequest();
		request.setContractNumber(contractNumber);
	/*	ResponseType response = (ResponseType) getWebServiceTemplate()
				.marshalSendAndReceive(request);*/
		Response response = (Response) getWebServiceTemplate()
				.marshalSendAndReceive(request);
		return response;
	}
}
