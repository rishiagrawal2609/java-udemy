package com.javaUdemy.AdvOpps;

interface Flyable {

	void fly();

}

class Bird implements Flyable {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("With Wings");

	}

}

class Aeroplane implements Flyable {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("With fuel");

	}

}

public class FlayableRunner {

	public static void main(String[] args) {

		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };

		for (Flyable object : flyingObjects) {
			object.fly();
		}

	}

}
