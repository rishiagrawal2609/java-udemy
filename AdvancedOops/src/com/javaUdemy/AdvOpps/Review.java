package com.javaUdemy.AdvOpps;

public class Review {

	int id;
	String review;
	int rating;

	public Review(int id, String review, int rating) {
		this.id = id;
		this.rating = rating;
		this.review = review;
	}

	@Override
	public String toString() {
		return String.format("ID - %d  Review - %s  Rating - %d", id, review, rating);
	}

}
