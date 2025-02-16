package com.dsa.datastructures.stack.linkedlist;

public class Stack {
	Node top;
	
	//check if stack is empty
	public boolean isEmpty() {
		return top==null;
	}
	
	//add elements in the stack: push operation
	public void push(int data) {
		Node node = new Node();
		node.data=data;
		node.next=top;
		top=node;
	}
	
	//delete the first element in the stack: pop operation
	public void pop() {
		Node temp = top;
		top = top.next;
		temp = null;
	}
	
	//display the top most element
	public int peek() {
		return top.data;
	}
	
	//display stack elements
	public void show() {
		Node curr = top;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
}
