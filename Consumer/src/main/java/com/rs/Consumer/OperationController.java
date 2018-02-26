package com.rs.Consumer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rs.Consumer.bean.Calculator;
import com.rs.Consumer.bean.CalculatorResponse;
import com.rs.Consumer.bean.Results;

@RestController
public class OperationController {
	private static final Logger LOGGER = LoggerFactory.getLogger(OperationController.class);

	/** Rest service to do mathematics operations
	 * @param calculatorBean
	 * @return
	 */
	@RequestMapping(value="/calculators" , method=RequestMethod.POST , consumes=MediaType.APPLICATION_JSON_VALUE , produces=MediaType.APPLICATION_JSON_VALUE)
	public Results fetchResult(@RequestBody Calculator calculatorBean){
		LOGGER.info("Inside OperationController:fetchResult() method"); 
		Results results = new Results();
		if(!CollectionUtils.isEmpty(calculatorBean.getNumbers()) && !StringUtils.isEmpty(calculatorBean.getOperation())){
			String operation = calculatorBean.getOperation();
				List<Double> list = calculatorBean.getNumbers();
				CalculatorConfiguration config = new CalculatorConfiguration();
				CalculatorClient client = config.calculatorClient(config.marshaller());
				//call the SOAP request for the response
				CalculatorResponse response = client.getOperationResult(operation,list);
				results.setOperation(operation);
				results.setResult(response.getOperationResponse());
			
		}
		return results;
	}

}
