package com.javaUdemy.loops;

public class MyNumber {

	private int number;

	MyNumber(int number) {
		if (number > 0) {
			this.number = number;
		} else {
			System.out.println("Invalid Number");
		}
	}

	public boolean isPrime() {

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumUptoN() {
		int total = 0;
		for (int i = 1; i <= number; i++) {
			total += i;
		}
		return total;
	}

	public int sumOfDivisors() {
		int total = 0;
		if (isPrime() == true) {
			total = number + 1;
		} else {
			for (int i = 1; i <= number; i++) {
				if (number % i == 0) {
					total += i;
				}
			}
		}
		return total;
	}

	public void printNumberTriangle() {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
