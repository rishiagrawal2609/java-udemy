package com.javaUdemy.AdvOpps;

abstract class Animal {
	public abstract void bark();
}

class Dog extends Animal {

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Bow Bow");
	}

}

class Cat extends Animal {

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Meow Meow");
	}

}

public class AnimalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal[] animals = { new Cat(), new Dog() };

		for (Animal animal : animals) {
			animal.bark();
		}

	}

}
