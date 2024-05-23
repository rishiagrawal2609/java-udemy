package com.javaUdemy.AdvOpps;

public class Recipie1 extends AbstactRecipie {

	@Override
	void getReady() {
		// TODO Auto-generated method stub
		System.out.println("Get Raw materials and utensils");
	}

	@Override
	void doTheDish() {
		// TODO Auto-generated method stub
		System.out.println("cook the raw materials and serve");
	}

	@Override
	void cleanup() {
		// TODO Auto-generated method stub
		System.out.println("Cleanup the utensils");

	}

}
