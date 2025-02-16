package com.dsa.datastructures.circulardoublylinkedlist;

public class CircularDoubleList {
	Node head;
	Node tail;
	
	//insert at Start
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data=data;
		if(head==null) {
			node.next=node.prev=node;
			head=node;
		}
		else {
			node.next=head;
			node.prev=tail;
			head.prev=node;
			tail.next=node;
			head=node;
		}
	}
	
	//insert at end
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		if(head==null) {
			node.next=node.prev=node;
			head=node;
		}
		else {
			tail=head.prev;
			node.next=head;
			node.prev=tail;
			tail.next=node;
			head.prev=node;
		}
	}
	
	//insert at given index
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data=data;
		Node curr = head;
		if(index==0) {
			insertAtStart(data);
		}
		for(int i=0; i<index-1;i++) {
			curr=curr.next;
		}
		node.prev=curr;
		node.next=curr.next;
		curr.next.prev=node;
		curr.next=node;	
	}
		
	
	public void show() {
		if(head==null) {
			System.out.println("Invalid operation");
		}
		else {
			Node curr = head;
			do {
				System.out.print(curr.data+" ");
				curr=curr.next;
			}while(curr!=head);
			System.out.println();
		}
	}

}
