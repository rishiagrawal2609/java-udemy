package com.javaUdemy.AdvOpps;

public class RecipieWithMicrowave extends AbstactRecipie {

	@Override
	void getReady() {
		// TODO Auto-generated method stub
		System.out.println("Get Raw materials and utensils");
		System.out.println("Switch on the Microwave");
	}

	@Override
	void doTheDish() {
		// TODO Auto-generated method stub
		System.out.println("cook the raw materials and serve");
		System.out.println("Put the processed raw material in microwave");
	}

	@Override
	void cleanup() {
		// TODO Auto-generated method stub
		System.out.println("Cleanup the utensils");
		System.out.println("Switch off the microwave");

	}

}
