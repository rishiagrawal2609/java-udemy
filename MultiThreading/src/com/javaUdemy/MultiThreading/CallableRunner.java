package com.javaUdemy.MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		return "Hello" + name;
	}

}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(1);

		Future<String> futureValue = executorService.submit(new CallableTask("Rishi"));
		System.out.println("Callable task executed");

		String message = futureValue.get();
		System.out.println(message);

		System.out.println("\n main program completed");

	}

}
