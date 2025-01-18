package com.dsa.datastructures.tree.binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	Node root;
	
	public void insert(int data) {
		root=insertRec(root,data);
	}
	
	public Node insertRec(Node root, int data) {
		if(root==null) {
			root = new Node(data);
		}
		else if(data<root.data) {
			root.left=insertRec(root.left,data);
		}
		else if(data>root.data) {
			root.right=insertRec(root.right, data);
		}
		
		return root;
	}
	
	public void inorder() {
		inorderRec(root);
		System.out.println();
	}
	public void inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.print(root.data+" ");
			inorderRec(root.right);
		}
	}
	
	public void preorder() {
		preorderRec(root);
		System.out.println();
	}
	public void preorderRec(Node root) {
		if(root!=null) {
		System.out.print(root.data+" ");
		preorderRec(root.left);
		preorderRec(root.right);
		}
	}
	
	public void postorder() {
		postorderRec(root);
		System.out.println();
	}
	public void postorderRec(Node root) {
		if(root!=null) {
			postorderRec(root.left);
			postorderRec(root.right);
			System.out.print(root.data+" ");
		}
	}
	
	public void bfs() {	
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			System.out.print(temp.data+" ");
			if(temp.left!=null) {
				queue.add(temp.left);
			}
			if(temp.right!=null) {
				queue.add(temp.right);
			}
		}
		}
}
