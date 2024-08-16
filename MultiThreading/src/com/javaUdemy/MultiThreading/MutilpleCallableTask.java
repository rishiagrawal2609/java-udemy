package com.javaUdemy.MultiThreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MutilpleCallableTask {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		List<CallableTask> callable = List.of(new CallableTask("Rishi2"), new CallableTask("Rishi3"),
				new CallableTask("Rishi"));

		String Value = executorService.invokeAny(callable);
		System.out.println("Callable task executed");

		System.out.println(Value);

		System.out.println("\n main program completed");

	}

}
