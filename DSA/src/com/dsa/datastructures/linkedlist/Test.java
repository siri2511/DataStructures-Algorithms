package com.dsa.datastructures.linkedlist;

public class Test {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(45);
		list.insert(18);
		list.insert(12);
		list.insertAtStart(10);
		list.insertAt(0,55);
		list.removeAt(2);
		list.show();
		System.out.println("Element 10 found at index: "+list.search(10));
		System.out.println("Length of the linked list: "+list.length());
	}
}
