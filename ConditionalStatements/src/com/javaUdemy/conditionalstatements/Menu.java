package com.javaUdemy.conditionalstatements;

public class Menu {

	private int num1;
	private int num2;

	Menu(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	int add() {
		return num1 + num2;
	}

	int subtract() {
		return num1 - num2;
	}

	double devide() {
		return num1 / num2;
	}

	int multiply() {
		return num1 * num2;
	}

}
