package com.dsa.datastrcutures.circulardoublylinkedlist;

public class Test {
	public static void main(String[] args) {
		CircularDoubleList list = new CircularDoubleList();
		list.insert(8);
		list.insert(10);
		list.insert(14);
		list.insertAtStart(6);
		list.insertAt(3, 12);
		list.show();
	}
}
