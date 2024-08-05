package com.javaUdemy.MultiThreading;

public class ThreadsBasicsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Task1
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task1 complete");

		// Task2
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task2 complete");

		// Task3
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task3 complete");

		System.out.println("\n Program complete");

		// no threads serial processing

	}

}
