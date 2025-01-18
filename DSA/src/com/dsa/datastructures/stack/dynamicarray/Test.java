package com.dsa.datastructures.stack.dynamicarray;

public class Test {
	public static void main(String[] args) {
		DynamicStack stack = new DynamicStack();
		stack.push(6);
		stack.push(8);
		stack.push(11);
		stack.push(10);
		stack.push(12);
		stack.show();
		System.out.println("Size: "+stack.size);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("Size: "+stack.size);
	}
}
