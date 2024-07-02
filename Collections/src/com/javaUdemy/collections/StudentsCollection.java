package com.javaUdemy.collections;

public class StudentsCollection implements Comparable<StudentsCollection> {

	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public StudentsCollection(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return id + " " + name;
	}

	@Override
	public int compareTo(StudentsCollection o) {
		// TODO Auto-generated method stub
		// return Integer.compare(this.id, o.id);
		return Integer.compare(o.id, this.id); // to do a reverse sort
	}

}
