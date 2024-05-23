package com.javaUdemy.AdvOpps;

public class Project {

	public static void main(String[] args) {

		// ComplexAlgorithm algo = new DummyAlgorithm();
		ComplexAlgorithm algo = new RealAlgorithm();
		System.out.println(algo.complexAlgorithm(10, 20));
	}

}
