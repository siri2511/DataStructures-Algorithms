package com.dsa.datastructures.queue.circulararray;

public class Queue {
	int n=5;
	int[] queue = new int[n];
	int size;
	int front=0;
	int rear=0;
	
	//insert value into queue: enqueue
	public void enqueue(int data) {
		if(!isFull()) {
		queue[rear]=data;
		rear=(rear+1)%n;
		size++;
		}
		else {
			System.out.println("The queue is full");
		}
	}
	
	//delete elements from stack: dequeue
	public int dequeue() {
		int data=0;
		if(!isEmpty()) {
		data= queue[front];
		front=(front+1)%n;
		size--;}
		else {
			System.out.println("Queue is empty");
		}
		return data;
	}
	
	//display elements of the queue
	public void show() {
		for(int i=0; i<size; i++) {
			System.out.print(queue[(front+i)%n]+" ");
		}
		System.out.println();
	}
	
	//return the size of the queue
	public int getSize() {
		return size;
	}
	
	//check if queue is empty or not
	public boolean isEmpty() {
		return size==0;
	}
	
	//check if the queue is full or not
	public boolean isFull() {
		return size==n;
	}
}
