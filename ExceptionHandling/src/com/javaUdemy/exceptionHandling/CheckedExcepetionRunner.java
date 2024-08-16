package com.javaUdemy.exceptionHandling;

public class CheckedExcepetionRunner {

	public static void main(String[] args) {

//		try {
//			someOtherMethod();
//		Thread.sleep(2000);
//		} catch (Exception e){
//			e.printStackTrace();
//		}

		// someOtherMethod();
	}

	public static void someOtherMethod2() throws RuntimeException { // Unchecked Exception

	}

	private static void someOtherMethod() throws InterruptedException { // Checked Exception - Risky Exception
		// TODO Auto-generated method stub
		Thread.sleep(2000);
	}

}
