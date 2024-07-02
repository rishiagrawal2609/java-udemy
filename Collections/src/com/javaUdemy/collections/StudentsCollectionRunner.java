package com.javaUdemy.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentCoparator implements Comparator<StudentsCollection> {

	@Override
	public int compare(StudentsCollection Student1, StudentsCollection Student2) {
		// TODO Auto-generated method stub
		return Integer.compare(Student1.getId(), Student2.getId());
	}

}

public class StudentsCollectionRunner {

	public static void main(String[] args) {

		List<StudentsCollection> students = List.of(new StudentsCollection("Rishi", 1),
				new StudentsCollection("maria", 100), new StudentsCollection("dave", 2));

		System.out.println(students);

		List<StudentsCollection> studentAl = new ArrayList<>(students);
		System.out.println(studentAl);

		Collections.sort(studentAl);

		System.out.println("Decending order: " + studentAl);

		Collections.sort(studentAl, new AscendingStudentCoparator());

		System.out.println("Accending order: " + studentAl);

		studentAl.sort(new AscendingStudentCoparator());
		System.out.println("Accending order: " + studentAl);

	}

}
