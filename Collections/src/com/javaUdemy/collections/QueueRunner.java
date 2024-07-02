package com.javaUdemy.collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.length(), o2.length());
	}

}

public class QueueRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());

		queue.addAll(List.of("Apple", "Bat", "Zebra", "Cat"));

		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

}
