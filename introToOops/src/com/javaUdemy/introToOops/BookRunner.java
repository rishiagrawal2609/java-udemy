package com.javaUdemy.introToOops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfProgramming = new Book(100);
		Book effectiveJava = new Book(150);
		Book cleanCode = new Book(200);

		// artOfProgramming.numberOfCopies = 100;
		// effectiveJava.numberOfCopies = 150;
		// cleanCode.numberOfCopies = 200;

		// artOfProgramming.printCopies(100);
		// effectiveJava.printCopies(150);
		// cleanCode.printCopies(200);
		artOfProgramming.printCopies();
		effectiveJava.printCopies();
		cleanCode.printCopies();

	}
}
