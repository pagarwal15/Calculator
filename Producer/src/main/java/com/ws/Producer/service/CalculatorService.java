package com.ws.Producer.service;


import java.util.List;
import org.springframework.stereotype.Service;
import com.ws.Producer.bean.CalculatorResponse;

@Service
public class CalculatorService {
	
	/** Method for addition functionality
	 * @param numbers
	 * @param response
	 * @return 
	 */
	public String add(List<Double> numbers){
		
		double result = 0.0;
		for (int i = 0; i < numbers.size(); i++) {
			result = result + numbers.get(i);
		}
		return String.valueOf(result);
	}
	/**
	 * Method for subtraction functionality
	 * @param numbers
	 * @param response
	 * @return 
	 */
	public String subtract(List<Double> numbers){ 
	
		double result =numbers.get(0);
		for (int i = 1; i < numbers.size(); i++) {
			result = result - numbers.get(i);
		}

		return String.valueOf(result);
		
	}
	/**
	 * Method for multiplication functionality
	 * @param numbers
	 * @param response
	 * @return 
	 */
	public String multiply(List<Double> numbers){
		
		double result = numbers.get(0);
		for (int i = 1; i < numbers.size(); i++) {
			result = result  * numbers.get(i);
		}

		return String.valueOf(result);
	}
	/**
	 * Method for division functionality
	 * @param numbers
	 * @param response
	 * @return 
	 */
	public String divide(List<Double> numbers){
		
		double result = numbers.get(0);
		for (int i = 1; i < numbers.size(); i++) {
			result = result / numbers.get(i);
		}

		return String.valueOf(result);
	}
	

}
