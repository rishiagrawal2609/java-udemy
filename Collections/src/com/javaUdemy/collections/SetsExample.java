package com.javaUdemy.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetsExample {

	public static void main(String[] args) {
		List<Character> ch = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

		System.out.println("HashSet: " + Unique(ch)); // Most Efficient

		System.out.println("TreeSet: " + UniqueSorted(ch)); // Provides Sorted order

		System.out.println("LinkedHashSet: " + UniqueInputOrder(ch)); // Provides Input Order

	}

	public static Set<Character> Unique(List<Character> ch) {
		Set<Character> ChSet = new HashSet<>();

		for (char c : ch) {
			ChSet.add(c);
		}
		return ChSet;
	}

	public static Set<Character> UniqueSorted(List<Character> ch) {
		Set<Character> ChSet = new TreeSet<>();

		for (char c : ch) {
			ChSet.add(c);
		}
		return ChSet;
	}

	public static Set<Character> UniqueInputOrder(List<Character> ch) {
		Set<Character> ChSet = new LinkedHashSet<>();

		for (char c : ch) {
			ChSet.add(c);
		}
		return ChSet;
	}

}
