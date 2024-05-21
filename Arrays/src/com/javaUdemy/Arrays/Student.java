package com.javaUdemy.Arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Student {
	private String name;
	// private int[] marks;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;
		// this.marks = marks;

		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		// return marks.length;
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		int max = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (mark > max) {
				max = mark;
			}
		}
		return max;
	}

	public int getMinimumMark() {
		int min = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (mark < min) {
				min = mark;
			}
		}
		return min;
	}

	public BigDecimal getAverageMarks() {

		BigDecimal sum = new BigDecimal(getTotalSumOfMarks());
		BigDecimal average = sum.divide(new BigDecimal(marks.size()), 3, RoundingMode.UP);
		return average;

	}

	@Override
	public String toString() {
		return name + marks;
	}

	public void addMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}
}
