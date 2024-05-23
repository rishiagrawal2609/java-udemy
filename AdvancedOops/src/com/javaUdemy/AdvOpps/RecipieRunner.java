package com.javaUdemy.AdvOpps;

public class RecipieRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Recipie1 recipie = new Recipie1();
		recipie.execute();

		System.out.println();

		RecipieWithMicrowave recipieq = new RecipieWithMicrowave();

		recipieq.execute();

	}

}
