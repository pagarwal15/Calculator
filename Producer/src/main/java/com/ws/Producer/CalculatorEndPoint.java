package com.ws.Producer;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


import com.ws.Producer.bean.CalculatorRequest;
import com.ws.Producer.bean.CalculatorResponse;
import com.ws.Producer.service.CalculatorService;

@Endpoint
public class CalculatorEndPoint {
	private static final Logger LOGGER = LoggerFactory.getLogger(CalculatorEndPoint.class);
	
	@PayloadRoot(namespace = "Calculator",localPart = "calculatorRequest")
	@ResponsePayload
	public CalculatorResponse getcalculatorResponse(@RequestPayload CalculatorRequest calculatorRequest) {
		LOGGER.info("Inside the producer");
		String operationType = (String)calculatorRequest.getOperation();
		
		CalculatorService service = new CalculatorService();
		List<Double> numbers = calculatorRequest.getNumberArray().getNumber();
		CalculatorResponse response = new CalculatorResponse();
		switch(operationType){
		case "add":
			response.setOperationResponse(service.add(numbers));
			break;
		case "subtract":
			response.setOperationResponse(service.subtract(numbers));
			break;
		case "multiply":
			response.setOperationResponse(service.multiply(numbers));
			break;
		case "divide":
			response.setOperationResponse(service.divide(numbers));
			break;
		default:
			response.setOperationResponse("Not a valid Operation");
		}
		return response;
	}
}