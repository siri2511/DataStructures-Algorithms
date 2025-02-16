package com.dsa.datastructures.stack.fixedarray;

public class Stack {
//	Stack(int n){
//		this.size=n;
//	}
	int size=5;
	int[] stack = new int[size];
	int top=-1;
	
	//insert an element into the stack
	public void push(int data) {
		++top;
		if(top>size-1) {
			System.out.println("Stack is full");
		}
		else {
		stack[top]=data;
		}
	}
	
	//delete the last element of the stack
	public int pop() {
		int data=-1;
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
		data= stack[top];
		stack[top]=0;
		top--;
		}
		return data;
	}
	
	//display the last element of the stack
	public int peek() {
		return stack[top];
	}
	
	//display the stack elements
	public void show() {
		for(int i=0; i<=top; i++) {
			System.out.print(stack[i]+" ");
		}
		System.out.println();
	}
	
	//return the size of the stack
	public int getSize() {
		return top+1;
	}
	
	//return if stack is empty or not
	public boolean isEmpty() {
		return top==-1;
	}
	
	//return if stack is full or not
	public boolean isFull() {
		return top==size-1;
	}
	
}
