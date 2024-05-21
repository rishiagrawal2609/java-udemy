package com.javaUdemy.AdvOpps;

public class Customer {

	private String name;

	private Address homeAddress;

	private Address workAddress;

	// Creating

	public Customer(String name, Address homeAddress) {

		this.name = name;
		this.homeAddress = homeAddress;

	}

	// operation

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddresss) {
		this.workAddress = workAddresss;
	}

	@Override
	public String toString() {
		return name + " " + homeAddress + " " + workAddress;
	}
}
