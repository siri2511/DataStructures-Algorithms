package com.dsa.datastructures.stack;

//import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		//scan size of stack
//		int n = sc.nextInt();
//		sc.close();
		Stack stack = new Stack();
		stack.push(6);
		stack.push(8);
		stack.push(11);
		System.out.println(stack.pop());
		stack.push(10);
//		stack.push(12);
//		stack.push(14);
		System.out.println(stack.peek());
		stack.show();
		System.out.println("Is the Stack Empty: "+stack.isEmpty());
		System.out.println("Is the Stack Full: "+stack.isFull());
		System.out.println("The size of the Stack: "+stack.getSize());
	}
}
