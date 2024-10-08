package com.javaUdemy.introToOops;

public class Book {
	// data
	private int numberOfCopies;

	Book(int noOfCopies) {
		this.numberOfCopies = noOfCopies;
	}

//	void printCopies(int numberOfCopies) {
//		this.numberOfCopies = numberOfCopies;
//		System.out.println(numberOfCopies);
//	}

	void printCopies() {
		System.out.println(this.numberOfCopies);
	}

	void increaseCopies(int no) {
		this.numberOfCopies += no;
	}

	void decreaseCopies(int no) {
		if (this.numberOfCopies < no) {
			this.numberOfCopies = 0;
		} else {
			this.numberOfCopies -= no;
		}
	}
}
