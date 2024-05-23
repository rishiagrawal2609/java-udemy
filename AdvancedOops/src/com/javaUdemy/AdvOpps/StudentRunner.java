package com.javaUdemy.AdvOpps;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Person is called Super Class , Student is sub class
		Student student = new Student("jay");
		student.setName("Rishi");
		student.setEmail("rishiagrawal2609@gmail.com");

		// IS A
		// Student IS A Person

		Person person = new Person("dueh");
		person.getClass(); // << Every class extends the root class names as Object>>//

		System.out.println(person);

		Employee employee = new Employee("erdfre");
	}

}
