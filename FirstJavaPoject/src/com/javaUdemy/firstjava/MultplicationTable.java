package com.javaUdemy.firstjava;

public class MultplicationTable {

	public static void tableOfNumber(int num) {
		for (int i=1;i<=10;i++) {
			System.out.printf("%d * %d = %d",num,i,num*i).println();
		}
	}
	public static void tableOfNumber(int num,int start,int stop) {
		for (int i=start;i<=stop;i++) {
			System.out.printf("%d * %d = %d",num,i,num*i).println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tableOfNumber(10,11,20);

	}

}
