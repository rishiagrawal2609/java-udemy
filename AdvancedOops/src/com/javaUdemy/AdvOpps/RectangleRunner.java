package com.javaUdemy.AdvOpps;

import java.math.BigDecimal;

public class RectangleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rect = new Rectangle(new BigDecimal(12), new BigDecimal(23));

		System.out.println(rect.area());

		System.out.println(rect.perimeter());
	}

}
