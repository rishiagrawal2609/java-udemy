package com.javaUdemy.AdvOpps;

public abstract class AbstactRecipie {

	// prepare
	// recipe
	// cleanup

	public void execute() {
		getReady();
		doTheDish();
		cleanup();
	}

	abstract void getReady();

	abstract void doTheDish();

	abstract void cleanup();

}
