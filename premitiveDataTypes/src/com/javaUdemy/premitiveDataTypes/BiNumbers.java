package com.javaUdemy.premitiveDataTypes;

public class BiNumbers {
	private int n1;
	private int n2;

	BiNumbers(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public int getNumber1() {
		return n1;

	}

	public int getNumber2() {
		return n2;
	}

	public int add() {
		return n1 + n2;
	}

	public int multiply() {
		return n1 * n2;

	}

	public void Double() {
		n1 *= 2;
		n2 *= 2;
	}

}
