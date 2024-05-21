package com.javaUdemy.AdvOpps;

public class FanRunner {
	public static void main(String[] args) {
		Fan fan = new Fan("Bajaj", "Black", 0.345);

		System.out.println(fan);

		fan.isOn(true);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte) 3);
		System.out.println(fan);
	}
}
