package com.dsa.datastructures.doublylinkedlist;

public class DoublyLinkedList {
	Node head;
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data=data;
		node.prev=null;
		node.next=null;
		
		if(head==null) {
			head=node;
		}
		else {
			head.prev=node;
			node.next=head;
			head=node;
		}
	}
	
	public void insert(int data) {
		Node n = new Node();
		Node curr = head;
		n.data=data;
		n.prev=null;
		n.next=null;
		if(head==null) {
			head=n;
		}
		else {
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=n;
		n.prev=curr;
		}
	}
	
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data=data;
		node.prev=null;
		node.next=null;
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
	
	public void removeAtStart() {
		Node n = head;
		head=n.next;
		if(head!=null) {
			head.prev=null;
		}
		n.next=null;
	}
	
	public void remove() {
		Node n = head;
		while(n.next!=null) {
			n=n.next;
		}
		if(n.prev!=null) {
			n.prev.next=null;
		}
	}
	
	public void removeAt(int index) {
		Node n = head;
		if(index==0) {
			removeAtStart();
		}
		for(int i =0; i<index-1; i++) {
			n=n.next;
		}
		n.next=n.next.next;
		n.next.prev=n;
	}
	
	public int head() {
		return head.data;
	}
	
	public void show() {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.println();
	}
	
	public int size() {
		Node n = head;
		int size=0;
		while(n!=null) {
			n=n.next;
			size++;
		}
		return size;
	}
	
	public void reverseTraversal() {
		Node n = head;
		while(n.next!=null) {
			n=n.next;
		}
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.prev;
		}
		System.out.println();
	}
	
	public int search(int target) {
		int index=0;
		Node n = head;
		while(n!=null) {
			if(n.data==target) {
				return index;
			}
			index++;
			n=n.next;
		}
		return -1;
	}
}
