package com.dsa.datastructures.queue.linkedlist;

public class Test {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(12);
		queue.enqueue(14);
		queue.enqueue(16);
		queue.show();
		queue.dequeue();
		queue.show();
		System.out.println(queue.getFront());
		System.out.println(queue.getRear());
	}
}
