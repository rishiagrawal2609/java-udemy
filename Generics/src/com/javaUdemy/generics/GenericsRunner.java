package com.javaUdemy.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer number = doubleValue(Integer.valueOf(5));

		List<Integer> listraw = new ArrayList<>(List.of(10, 12, 34));

		dublicateList(listraw);

		System.out.println(listraw);

		System.out.println(sumOfNumbers(List.of(1, 2, 3, 5)));

		System.out.println(sumOfNumbers(List.of(1.5, 2.34, 3.3444, 5.1232)));
		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Element 1");
		list.addElement("Element 2");
		System.out.println(list.get(0));

		MyCustomList<Integer> intlist = new MyCustomList<>();
		intlist.addElement(Integer.valueOf(5));
		intlist.addElement(Integer.valueOf(10));
		System.out.println(intlist.get(0));

		System.out.println(list);
		System.out.println(intlist);

	}

	static <X> X doubleValue(X value) {
		return value;
	}

	static <X extends List> void dublicateList(X list) {
		list.addAll(list);
	}

	static double sumOfNumbers(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}

}
