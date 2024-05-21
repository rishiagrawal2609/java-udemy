package com.javaUdemy.AdvOpps;

public class Employee extends Person {

	private String title;
	private String employer;
	private String emplyeeGrade;
	private int salary;

	public Employee() {
		super();
		System.out.println("Employee Constructor");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getEmplyeeGrade() {
		return emplyeeGrade;
	}

	public void setEmplyeeGrade(String emplyeeGrade) {
		this.emplyeeGrade = emplyeeGrade;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString()
				+ String.format("Name: %s Email: %s phNo: %s title: %s employer: %s emplyeeGrade: %s salary: %d",
						getName(), getEmail(), getPhno(), title, employer, emplyeeGrade, salary);

	}

}
