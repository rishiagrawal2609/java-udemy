package com.javaUdemy.introToOops;

public class MotorBike {

	// data - memberVariable
	private int speed;

	// default Constructor
	MotorBike() {
		this(20);
	}

	// constructor
	MotorBike(int speed) {
		this.speed = speed;
	}

	// Behavior
	void start() {
		System.out.println("Starting");
	}

	// Method

	// -input - variable speed
	// - Output - void
	// - name - setSpeed

	// setter method
	void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
		System.out.println(speed);

	}

	// getter method
	int getSpeed() {
		return this.speed;
	}

	// Increase speed
	void increaseSpeed(int addSpeed) {
		this.speed += addSpeed;
	}

	void decreaseSpeed(int redSpeed) {
		setSpeed(this.speed - redSpeed);
	}
}
