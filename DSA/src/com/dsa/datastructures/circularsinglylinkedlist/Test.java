package com.dsa.datastructures.circularsinglylinkedlist;

public class Test {
	public static void main(String[] args) {
		CircularSingleList list = new CircularSingleList();
		list.insert(8);
		list.insert(10);
		list.insertAtStart(6);
		list.insert(12);
		list.insertAt(2, 11);
//		list.deleteAtStart();
		list.delete();
		list.show();
		System.out.println("current head: "+list.head());
		list.tail();
		System.out.println("Element 10 found at index: "+list.search(10));
		
		
	}
}
