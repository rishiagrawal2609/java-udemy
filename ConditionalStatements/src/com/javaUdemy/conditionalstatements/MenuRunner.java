package com.javaUdemy.conditionalstatements;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);

		System.out.println("Enter First Number:");
		int number1 = Scan.nextInt();

		System.out.println("Enter Number 2:");
		int number2 = Scan.nextInt();

		System.out.println();

		System.out.printf("1.Add \n2.Subtract \n3.Divide \n4.Multiply \n");

		System.out.print("Choose the opreation you want to perform on 2 numbers: ");
		int choice = Scan.nextInt();
		Scan.close();
		Menu calculator = new Menu(number1, number2);
		if (choice == 1) {
			System.out.println(calculator.add());
		} else if (choice == 2) {
			System.out.println(calculator.subtract());
		} else if (choice == 3) {
			System.out.println(calculator.devide());
		} else if (choice == 4) {
			System.out.println(calculator.multiply());
		} else {
			System.out.println("Invaild please start the progam again");
		}

		// Switch Statements

		switch (choice) {

		case 1: {
			System.out.println(calculator.add());
			break;
		}
		case 2: {
			System.out.println(calculator.subtract());
			break;
		}
		case 3: {
			System.out.println(calculator.devide());
			break;
		}
		case 4: {
			System.out.println(calculator.multiply());
			break;
		}
		default: {
			System.out.println("Invaild please start the progam again");
		}
		}
	}

}
