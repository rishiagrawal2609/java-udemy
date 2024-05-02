package com.javaUdemy.loops;

public class MyNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber num = new MyNumber(7);

		System.out.println("Is Prime? " + num.isPrime());

		System.out.println(num.sumUptoN());

		System.out.println(num.sumOfDivisors());

		num.printNumberTriangle();

	}

}
