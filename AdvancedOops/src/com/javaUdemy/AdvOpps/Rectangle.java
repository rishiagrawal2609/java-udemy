package com.javaUdemy.AdvOpps;

import java.math.BigDecimal;

public class Rectangle {

	// states

	private BigDecimal length;
	private BigDecimal breath;

	Rectangle(BigDecimal length, BigDecimal breath) {
		this.length = length;
		this.breath = breath;
	}

	public BigDecimal area() {
		return length.multiply(breath);
	}

	public BigDecimal perimeter() {
		return length.add(breath).multiply(new BigDecimal(2));
	}

	public BigDecimal getLength() {
		return length;
	}

	public void setLength(BigDecimal length) {
		this.length = length;
	}

	public BigDecimal getBreath() {
		return breath;
	}

	public void setBreath(BigDecimal breath) {
		this.breath = breath;
	}

}
