package com.dsa.datastructures.stack.linkedlist;

public class Test {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(6);
		stack.push(8);
		stack.push(10);
		stack.push(12);
		stack.show();
		stack.pop();
		stack.show();
	}
}
