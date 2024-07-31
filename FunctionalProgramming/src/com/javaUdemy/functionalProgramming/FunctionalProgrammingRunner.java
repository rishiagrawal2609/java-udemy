package com.javaUdemy.functionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");

		printBasic(list);
		printWithFp(list);
		printWithFpFilter(list);

	}

	public static void printBasic(List<String> list) {

		for (String str : list) {

			System.out.println(str);

		}

	}

	public static void printWithFp(List<String> list) {

		list.stream().forEach(element -> System.out.println(element) // lambda function
		);

	}

	public static void printBasicFilter(List<String> list) {

		for (String str : list) {

			if (str.endsWith("at")) {

				System.out.println(str);

			}
		}

	}

	public static void printWithFpFilter(List<String> list) {

		list.stream().filter(ele -> ele.endsWith("at")).forEach(element -> System.out.println(element) // lambda
																										// function
		);

	}

}
