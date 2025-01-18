package com.dsa.datastructures.tree.binarysearchtree;

public class Test {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insert(6);
		tree.insert(2);
		tree.insert(10);
		tree.insert(1);
		tree.insert(4);
		tree.insert(8);
		tree.insert(12);
		tree.inorder();
		tree.preorder();
		tree.postorder();
		tree.bfs();
	}
}
