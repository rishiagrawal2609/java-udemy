package com.javaUdemy.functionalProgramming;

import java.util.List;
import java.util.stream.IntStream;

public class FpNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = List.of(2, 3, 4, 5, 6, 7, 45);

		int sum = list.stream().filter(ele -> ele % 2 != 0).reduce(0, (number1, number2) -> number1 + number2);

		System.out.println(sum);

		IntStream.range(0, 10).map(e -> e * e).forEach(ele -> System.out.println(ele));

		List<String> str = List.of("Apple", "Ant", "Bat");

		str.stream().map(ele -> ele.toLowerCase()).forEach(ele -> System.out.println(ele));

		List.of("Apple", "Ant", "Bat").stream().map(ele -> ele.length()).forEach(ele -> System.out.println(ele));

		List.of(2, 3, 4, 5, 6, 7, 45).stream().max((n1, n2) -> Integer.compare(n1, n2)).get();

	}

}
