package com.javaUdemy.AdvOpps;

public class bookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book(123, "Intro to Oops", "Ranga");

		book.addReview(new Review(10, "good book", 5));
		book.addReview(new Review(122, "best author", 5));

		System.out.println(book);
	}

}
