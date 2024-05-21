package com.javaUdemy.AdvOpps;

import java.util.ArrayList;

public class Book {

	private int id;
	private String title;
	private String author;
	private ArrayList<Review> reviewList = new ArrayList<Review>();

	public Book(int id, String title, String author) {

		this.author = author;
		this.title = title;
		this.id = id;

	}

	public void addReview(Review review) {
		reviewList.add(review);
	}

	@Override
	public String toString() {
		return String.format("id: %d  title: %s  author: %s review: %s", id, title, author, reviewList);

	}

}
