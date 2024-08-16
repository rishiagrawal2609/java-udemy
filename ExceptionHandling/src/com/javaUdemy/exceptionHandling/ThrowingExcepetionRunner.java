package com.javaUdemy.exceptionHandling;

class CurenciesDoNotMatchException extends Exception {

	public CurenciesDoNotMatchException(String message) {
		super(message);

	}
}

class Ammount {
	private String curency;
	private int amount;

	public Ammount(String curency, int ammount) {
		super();
		this.curency = curency;
		this.amount = ammount;
	}

	@Override
	public String toString() {
		return amount + " " + curency;
	}

	public void add(Ammount other) throws CurenciesDoNotMatchException {

		if (!this.curency.equals(other.curency)) {
//			throw new Exception("Currenices dont match " + this.curency + " & " + other.curency);
			throw new CurenciesDoNotMatchException("Currenices dont match " + this.curency + " & " + other.curency);
		}
		this.amount += other.amount;
	}

}

public class ThrowingExcepetionRunner {

	public static void main(String[] args) throws CurenciesDoNotMatchException {
		// TODO Auto-generated method stub

		Ammount amount1 = new Ammount("USD", 10);
		Ammount amount2 = new Ammount("EUR", 20);
		amount1.add(amount2);
		System.out.println(amount1);

	}

}
