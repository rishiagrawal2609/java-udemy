package com.javaUdemy.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

	private int number;

	public Task(int number) {
		this.number = number;
	}

	@Override
	public void run() { // should match the exact signature

		System.out.print("Task " + number + " start \n");

		for (int i = number * 100; i <= number * 100 + 99; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task " + number + " complete");

	}
}

public class ThreadsExecutorservice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		ExecutorService executorService = Executors.newSingleThreadExecutor(); --> For single thread
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		executorService.execute(new Task(1));
		executorService.execute(new Thread(new Task(2)));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		executorService.execute(new Task(7));

		executorService.shutdown();
	}

}
