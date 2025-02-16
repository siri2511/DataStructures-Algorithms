package com.dsa.datastructures.circularsinglylinkedlist;

public class CircularSingleList {
	Node head;
	Node tail;
	
	//insert node at end
	public void insert(int data) {
		Node node = new Node();
		node.data=data;
		if(head==null) {
			head=node;
			tail=node;
			node.next=head;
		}
		else {
			tail.next=node;
			node.next=head;
			tail=node;
		}
	}
	
	//insert node at start
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data=data;
		if(tail==null) {
			head=node;
			tail=node;
			node.next=head;
		}
		else {
			node.next=head;
			tail.next=node;
			head=node;
		}
	}
	
	//insert at specific index
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		if(tail==null) {
			if(index!=0) {
				System.out.println("Invalid operation");
			}
			else {
				tail=node;
				tail.next=tail;
			}
		}
		if(index==0) {
			insertAtStart(data);
		}
		else {
			Node curr = tail.next;
			for(int i=0; i<index-1; i++) {
				curr=curr.next;
			}
			node.next=curr.next;
			curr.next=node;
			if(tail==curr) {
				tail=node;
			}
		}
	}
	
	//delete from start
	public void deleteAtStart() {
		if(tail==null) {
			System.out.println("Invalid operation");
		}
		if(head==tail) {
			tail=null;
		}
		else {
			tail.next=head.next;
			head=head.next;
			
		}
	}
	
	//delete at specific index
	public void deleteAt(int index) {
		if(tail==null) {
			System.out.println("Invalid operation");
		}
		else {
			Node curr = head;
			for(int i=0; i<index-1; i++) {
				curr = curr.next;
			}
			Node n1= curr.next;
			curr.next=n1.next;
			n1.next=null;
		}
	}
	
	//Delete at end of list
	public void delete() {
		if(head==null) {
			System.out.println("Invalid operation");
		}
		if(head==tail) {
			head=null;
			tail=null;
			head.next=null;
			tail.next=null;
		}
		Node curr = head;
		while(curr.next!=tail) {
			curr=curr.next;
		}
		curr.next=head;
		tail=curr;
	}
	
	public void show() {
		Node curr = head;
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			do {
				System.out.print(curr.data+" ");
				curr=curr.next;
			}while(curr!=head);
			System.out.println();
		}
	}
	
	public int head() {
		return head.data;
	}
	
	//search target value in list
	public int search(int target) {
		if(head==null) {
			return -1;
		}
		int index=0;
		Node curr = head;
		while(curr!=tail) {
			if(curr.data==target) {
				return index;
			}
			index++;
			curr=curr.next;
		}
		if(curr.data==target) {
			return index;
		}
		return -1;
	}
	public void tail() {
		System.out.println(tail.data);
	}
}
