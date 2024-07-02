package com.javaUdemy.collections;

import java.util.HashMap;
import java.util.Map;

public class CharCountMap {

	String str = "This is a awssome ocassion. " + "This has never happend before";

	Map<Character, Integer> occurances = new HashMap<>();

	char[] chars = str.toCharArray();

}
