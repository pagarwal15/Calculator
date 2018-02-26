package com.rs.Consumer.bean;

import java.util.List;

public class Calculator {
	
	private List<Double> numbers;
	private String operation;
	
	/**
	 * @return the numbers
	 */
	public List<Double> getNumbers() {
		return numbers;
	}
	/**
	 * @param numbers the numbers to set
	 */
	public void setNumbers(List<Double> numbers) {
		this.numbers = numbers;
	}
	/**
	 * @return the operations
	 */
	public String getOperation() {
		return operation;
	}
	/**
	 * @param operations the operations to set
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	
	

}
