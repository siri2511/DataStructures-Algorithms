package com.dsa.datastructures.linkedlist;

public class LinkedList {
	Node head;
	public void insert(int data) {
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		if(head==null) {
			head=node;
		}
		else {
			Node n = head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
	}
	public void show() {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.println();
	}
	
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data=data;
		node.next=head;
		head=node;
	}
	
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		if(index==0) {
			insertAtStart(data);
		}
		else {
		Node n = head;
		for(int i=0; i<index-1 && n.next!=null; i++) {
			 n=n.next;
		}
		node.next=n.next;
		n.next=node;
		}
	}
	public void removeAt(int index) {
		if(index==0) {
			head=head.next;
		}
		else {
			Node n= head;
			for(int i=0; i<index-1 && n.next!=null; i++) {
				n=n.next;
			}
			Node n1=n.next;
			n.next=n1.next;
//			System.out.println(n1.data);
			n1=null;
		}
	}
	public int search(int target) {
		Node n = head;
		int i=0;
		while(n.next!=null) {
			if(n.data==target) {
				return i;
			}
			i++;
			n=n.next;
		}
		return -1;
	}
	
	public int length() {
		int length=0;
		Node n = head;
		while(n!=null) {
			n=n.next;
			length++;
		}
		return length;
	}
}
