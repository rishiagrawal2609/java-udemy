package com.javaUdemy.AdvOpps;

public class MarioGame implements GamingInterface {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Jump");

	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Duck");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("move forward");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("move backward");
	}

}
