package com.javaUdemy.exceptionHandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {

			int[] arr = { 1, 2, 3, 4 };

			int num = arr[5];

			System.out.println("Before scanner close");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			scan.close();
		}

		System.out.println("Jusr after the execption defined");

	}

}
