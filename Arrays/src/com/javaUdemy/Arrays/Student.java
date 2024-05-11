package com.javaUdemy.Arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
	private String name;
	private int[] marks;

	Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	public int getNumberOfMarks() {
		return marks.length;
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		int max = marks[0];
		for (int mark : marks) {
			if (mark > max) {
				max = mark;
			}
		}
		return max;
	}

	public int getMinimumMark() {
		int min = marks[0];
		for (int mark : marks) {
			if (mark < min) {
				min = mark;
			}
		}
		return min;
	}

	public BigDecimal getAverageMarks() {

		BigDecimal sum = new BigDecimal(getTotalSumOfMarks());
		BigDecimal average = sum.divide(new BigDecimal(marks.length), 3, RoundingMode.UP);
		return average;

	}
}
