package com.dsa.datastructures.stack.dynamicarray;

public class DynamicStack {
	int size=2;
	int[] stack = new int[size];
	int top=-1;
	
	//insert an element into the stack
	public void push(int data) {
		++top;
		if(getSize()==size) {
			expand();
		}
		stack[top]=data;
		
	}
	
	//expanding stack size
	public void expand() {
		int length = getSize();
		int[] newStack = new int[size*2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack=newStack;
		size*=2;
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
		shrink();
		}
		return data;
	}
	
	//shrinking the array
	public void shrink() {
		int length = getSize();
		if(length<=(size/4)) {
			size = size/2;
			 int newStack[] = new int[size];
			 System.arraycopy(stack, 0, newStack, 0, length);
			 stack = newStack;
		}
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
