package com.javaUdemy.AdvOpps;

public class Student extends Person {
	private String College;
	private int year;

	public String getCollege() {
		return College;
	}

	public void setCollege(String college) {
		College = college;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
