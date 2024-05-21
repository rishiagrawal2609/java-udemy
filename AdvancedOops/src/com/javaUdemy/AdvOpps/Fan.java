package com.javaUdemy.AdvOpps;

public class Fan {

	// state
	private String make;
	private String color;
	private double radius;

	private boolean isOn;
	private byte speed; // 0 to 5

	// creation
	// constructor
	Fan(String make, String color, double radius) {
		this.make = make;
		this.color = color;
		this.radius = radius;
	}

	// Behaviors

	public void isOn(boolean isOn) {
		this.isOn = isOn;
	}

	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 5);
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	// print the state
	@Override
	public String toString() {
		return String.format("make = %s  color = %s radius = %f speed = %d isOn = %b", make, color, radius, speed,
				isOn);
	}

}
