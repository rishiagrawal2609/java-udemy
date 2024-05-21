package com.javaUdemy.AdvOpps;

public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address homeAddress = new Address("line", "Chennai", "60089");

		Customer cust = new Customer("Rishi", homeAddress);

		Address workAddress = new Address("workspace", "Chennai", "600002");

		cust.setWorkAddress(workAddress);

		System.out.println(cust);

	}

}
