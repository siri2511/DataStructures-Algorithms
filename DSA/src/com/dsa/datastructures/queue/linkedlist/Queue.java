package com.dsa.datastructures.queue.linkedlist;

public class Queue {
	Node front, rear;
	
	//insert values into queue: enqueue
	public void enqueue(int data) {
		Node node = new Node();
		node.data=data;
		if(rear==null) {
			front=rear=node;
		}
		else {
			rear.next=node;
			rear=node;
		}
	}
	
	//delete values from queue: dequeue
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			Node temp = front;
			front=front.next;
			temp = null;
			if(front==null) {
				rear=null;
			}
		}
	}
	
	//check if the queue is empty or not
	public boolean isEmpty(){
		return front==null && rear==null;
	}
	
	//extract the front of the queue
	public int getFront() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		return front.data;
	}
	
	//extract the end of the queue
	public int getRear() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		return rear.data;
	}
	
	//display elements of queue
	public void show() {
		Node temp=front;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	
}
