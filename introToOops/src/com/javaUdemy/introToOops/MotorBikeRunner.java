package com.javaUdemy.introToOops;

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(120);
		MotorBike hero = new MotorBike();
		ducati.start();
		honda.start();
		hero.start();
		// ducati.speed = 100;
		// honda.speed = 80;

		// ducati.setSpeed(100);
		// honda.setSpeed(80);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

		// get current speed
		// add 100 to that speed
		// set the speed.
		int ducatiSpeed = ducati.getSpeed();
		int addspeed = 100;
		int newSpeed = ducatiSpeed + addspeed;
		ducati.setSpeed(newSpeed);

		int hondaSpeed = honda.getSpeed();
		hondaSpeed += 100;
		honda.setSpeed(hondaSpeed);

		ducati.decreaseSpeed(100);
		System.out.println(ducati.getSpeed());
		honda.increaseSpeed(20);
		System.out.println(honda.getSpeed());

	}

}
