package com.dsa.datastructures.doublylinkedlist;

public class Test {
public static void main(String[] args) {
	DoublyLinkedList list = new DoublyLinkedList();
	list.insert(10);
	list.insert(12);
	list.insertAtStart(6);
	list.insertAt(1, 8);
	list.insertAt(3, 14);
//	list.insertAt(3, 11);
//	list.insert(15);
//	list.insertAtStart(5);
//	list.removeAtStart();
//	list.remove();
//	list.removeAt(3);
//	list.removeAt(4);
	list.show();
	
	System.out.println("Current head: "+list.head());
	list.reverseTraversal();
	System.out.println("Element 10 found at index: "+list.search(10));
}
}
