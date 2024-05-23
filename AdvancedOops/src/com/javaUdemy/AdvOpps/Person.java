package com.javaUdemy.AdvOpps;

public class Person {

	private String name;
	private String email;
	private String phno;

	public Person(String name) {
		System.out.println("Person Constructor");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "# overideded the calls";
	}

}
