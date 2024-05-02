package com.javaUdemy.loops;

public class WhileNumberPlayerRunner {

	public static void main(String[] args) {
		WhileNumberPlayer num = new WhileNumberPlayer(30);

		num.printSquaresUptoLimit();
		System.out.println();
		num.printCubesUptoLimit();
	}
}
