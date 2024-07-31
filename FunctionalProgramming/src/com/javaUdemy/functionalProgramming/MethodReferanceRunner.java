package com.javaUdemy.functionalProgramming;

import java.util.List;

public class MethodReferanceRunner {

	public static void print(int s) {
		System.out.println(s);
	}

	public static boolean isEven(Integer n) {
		return n % 2 == 0;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(e -> System.out.println(e));

		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length()).forEach(System.out::println);

		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(String::length)
				.forEach(MethodReferanceRunner::print);

		Integer max = List.of(23, 45, 67, 34).stream().filter(n -> n % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2))
				.orElse(0);

		System.out.println(max);

		Integer max_method_ref = List.of(23, 45, 67, 34).stream().filter(MethodReferanceRunner::isEven)
				.max(Integer::compare).orElse(0);

		System.out.println(max_method_ref);

	}

}
