package com.dsa.datastructures.queue.circulararray;

public class Test {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(6);
		queue.enqueue(8);
		queue.enqueue(10);
		queue.enqueue(12);
		queue.show();
		queue.dequeue();
		queue.dequeue();
		queue.show();
		queue.enqueue(14);
		queue.enqueue(16);
		queue.show();
		System.out.println(queue.getSize());
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
	}
}
