package com.javaUdemy.collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is a awssome ocassion. " + "This has never happend before";

		Map<Character, Integer> occurances = new HashMap<>();

		char[] chars = str.toCharArray();

		for (char ch : chars) {

			Integer localValue = occurances.get(ch);

			if (localValue == null) {
				occurances.put(ch, 1);
			} else {
				occurances.put(ch, localValue + 1);
			}

		}

		System.out.println(occurances);

		Map<String, Integer> wordCount = new HashMap<>();

		String[] words = str.split(" ");

		for (String S : words) {
			Integer count = wordCount.get(S);
			if (count == null) {
				wordCount.put(S, 1);
			} else {
				wordCount.put(S, count + 1);
			}
		}

		System.out.println(wordCount);
	}

}
