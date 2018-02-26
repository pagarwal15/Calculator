package com.ws.Producer.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CalculatorServiceTest{

	@Test
	public void testAdd() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		CalculatorService calculatorService= new CalculatorService();
		String d=calculatorService.add(numbers);
		assertEquals("3.0", d);
	}
	
	@Test
	public void testSubtract() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(5.0);
		numbers.add(2.0);
		CalculatorService calculatorService= new CalculatorService();
		String d=calculatorService.subtract(numbers);
		assertEquals("3.0", d);
	}
	@Test
	public void testMuliply() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		CalculatorService calculatorService= new CalculatorService();
		String d=calculatorService.multiply(numbers);
		assertEquals("2.0", d);
	}
	@Test
	public void testDivide() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(10.0);
		numbers.add(2.0);
		CalculatorService calculatorService= new CalculatorService();
		String d=calculatorService.divide(numbers);
		assertEquals("5.0", d);
	}

}
