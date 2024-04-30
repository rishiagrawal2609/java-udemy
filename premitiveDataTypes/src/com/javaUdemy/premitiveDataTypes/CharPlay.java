package com.javaUdemy.premitiveDataTypes;

public class CharPlay {

	private char c;

	CharPlay(char c) {
		this.c = c;
	}

	public boolean isVowel() {

		if (c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u' | c == 'A' | c == 'E' | c == 'I' | c == 'O'
				| c == 'U') {
			return true;
		}

		return false;
	}

	public boolean isNumber() {
		if (c >= 48 && c <= 57) {
			return true;
		}

		return false;
	}

	public boolean isConsonent() {
		return isAlphabet() && !isVowel();
	}

	public boolean isAlphabet() {
		if ((c >= 97 && c <= 122) || (c >= 65 && c <= 90)) {
			return true;
		}

		return false;

	}

	public static void printLowerCaseAlphabets() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}

	public static void printUpperCaseAlphabets() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}
}
