package com.javaUdemy.exceptionHandling;

public class ExceptionHandlingRunnerTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method2();

		System.out.println("Main Ended");

	}

	public static void method2() {
		method1();
		System.out.println("method 2 ended");
	}

	public static void method1() {

		String str = null;

		str.length();

		System.out.println("Method 3 ended");
	}

}
