package com.javaUdemy.premitiveDataTypes;

import java.math.BigDecimal;

public class simpleInterstCalculatorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleIntrestCalculator calculator = new SimpleIntrestCalculator("4500", "7.5");

		BigDecimal totalValue = calculator.calculateTotalValue(5);

		System.out.println(totalValue);

	}

}
