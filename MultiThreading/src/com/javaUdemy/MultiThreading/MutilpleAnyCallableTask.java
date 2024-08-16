package com.javaUdemy.MultiThreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MutilpleAnyCallableTask {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		List<CallableTask> callable = List.of(new CallableTask("Rishi"), new CallableTask("Rishi"),
				new CallableTask("Rishi"));

		List<Future<String>> futureValue = executorService.invokeAll(callable);
		System.out.println("Callable task executed");

		for (Future<String> str : futureValue) {
			System.out.println(str.get());
		}

		System.out.println("\n main program completed");

	}

}
