package com.javaUdemy.premitiveDataTypes;

import java.math.BigDecimal;

public class SimpleIntrestCalculator {

	private BigDecimal principle;
	private BigDecimal intrest;
	private BigDecimal siOf1Year;
	private int noOfYears;

	SimpleIntrestCalculator(String principle, String intrest) {
		this.principle = new BigDecimal(principle);
		this.intrest = new BigDecimal(intrest).divide(new BigDecimal(100));
		this.siOf1Year = this.principle.multiply(this.intrest);
	}

	BigDecimal calculateTotalValue(int NoOfYears) {
		this.noOfYears = NoOfYears;
		BigDecimal si = siOf1Year.multiply(new BigDecimal(noOfYears));
		return si.add(principle);
	}

}
