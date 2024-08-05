package com.javaUdemy.MultiThreading;

class Task1 extends Thread {
	@Override
	public void run() { // should match the exact signature

		System.out.print("Task 1 start \n");

		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task1 complete");

	}
}

public class ThreadsThreadClassRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// using thread class

		// Task1
		Task1 task1 = new Task1();

		// task1.run(); ---> Do not use this

		task1.start();

		// Task2
		System.out.print("Task 2 start \n");

		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task2 complete");

		// Task3

		System.out.print("Task 3 start \n");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task3 complete");

		System.out.println("\n Program complete");

	}

}
