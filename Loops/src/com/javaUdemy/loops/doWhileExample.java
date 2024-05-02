package com.javaUdemy.loops;

import java.util.Scanner;

public class doWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int number = -1;
		do {
			if (number != -1) {
				System.out.println("Cube is " + (number * number * number));
			}
			System.out.print("Enter the Number: ");
			number = scan.nextInt();

		} while (number >= 0);

		System.out.println("Thank You! Have Fun!");

	}

}
