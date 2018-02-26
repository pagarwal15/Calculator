package com.rs.Consumer;

import java.util.List;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.rs.Consumer.bean.CalculatorRequest;
import com.rs.Consumer.bean.CalculatorRequest.NumberArray;
import com.rs.Consumer.bean.CalculatorResponse;

public class CalculatorClient extends WebServiceGatewaySupport{
	
	/**
	 * Method to call the SOAP service by passing the input
	 * @param operation
	 * @param list
	 * @return object of calculator response
	 */
	public CalculatorResponse getOperationResult(String operation, List<Double> list){
		
		CalculatorRequest request = new CalculatorRequest();
		request.setOperation(operation);
		NumberArray array = new NumberArray();
		array.getNumber().addAll(list);
		request.setNumberArray(array);
		//Call the SOAP Producer for the response
		CalculatorResponse response = (CalculatorResponse) getWebServiceTemplate().marshalSendAndReceive("http://localhost:8180/ws", request
		,new SoapActionCallback("Calculator/calculatorRequest"));
		return response;
		
	}

}
