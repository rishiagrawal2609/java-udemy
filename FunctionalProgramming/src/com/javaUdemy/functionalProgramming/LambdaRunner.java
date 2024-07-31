package com.javaUdemy.functionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class evenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		// TODO Auto-generated method stub
		return number % 2 == 0;
	}

}

class printNumberConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}

}

class SquareNumberFuction implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer t) {
		// TODO Auto-generated method stub
		return t * t;
	}

}

public class LambdaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List.of(23, 43, 34, 45, 36, 68).stream().filter(n -> n % 2 == 0).map(n -> n * n)
				.forEach(e -> System.out.println(e));

		List.of(23, 43, 34, 45, 36, 68).stream().filter(new evenNumberPredicate()).map(new SquareNumberFuction())
				.forEach(new printNumberConsumer());

		// Stream<T> filter(Predicate<? super T> predicate);

		// Predicate --> Functional Interface
		// boolean test(T t);

		// void forEach(Consumer<? super T> action);
		// void accept(T t);

		// <R> Stream<R> map(Function<? super T, ? extends R> mapper);
		// R apply(T t);

	}

}
