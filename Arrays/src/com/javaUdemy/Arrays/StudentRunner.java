package com.javaUdemy.Arrays;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = { 24, 25, 19, 23 };
		Student dave = new Student("Dave", marks);

		System.out.println(dave.getNumberOfMarks());
		System.out.println(dave.getTotalSumOfMarks());
		System.out.println(dave.getMaximumMark());
		System.out.println(dave.getMinimumMark());
		System.out.println(dave.getAverageMarks());

	}

}
