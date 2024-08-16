package com.javaUdemy.exceptionHandling;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method2();

		System.out.println("Main Ended");

	}

	public static void method2() {
		method1();
		System.out.println("method 2 ended");
		// Exceptions is not visible to the calling methods.
	}

	public static void method1() {

		try {

			// String str = null;
			// str.length();

			int[] a = { 1, 2 };
			int number = a[3];

		}

		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Array out of bound");
		}

		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Null value Provided");
		}

		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Generic Exceptioon");
			// not required to have this, prints by default
		}

		System.out.println("Method 1 ended");
	}

}
