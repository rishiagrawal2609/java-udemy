package com.javaUdemy.premitiveDataTypes;

public class CharPlayRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CharPlay ch = new CharPlay('r');
		System.out.println(ch.isVowel());

		System.out.println(ch.isNumber());

		System.out.println(ch.isAlphabet());

		System.out.println(ch.isConsonent());
		CharPlay.printLowerCaseAlphabets();
		CharPlay.printUpperCaseAlphabets();
	}

}
