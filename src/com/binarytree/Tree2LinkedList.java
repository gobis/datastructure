package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree2LinkedList {

	public static void main(String[] args) {

	}

	public static void TreeToList(Node head) {

		Queue queueTree = new LinkedList<Node>();
		queueTree.add(head);

		Node prevE = null;

		while (!queueTree.isEmpty()) {
			Node top = (Node) queueTree.peek();
			queueTree.remove();

			if (null != top.left)
				queueTree.add(top.left);
			if (null != top.right)
				queueTree.add(top.right);

			top.left = prevE;
			top.right = (Node) queueTree.peek();
			prevE = top;
		}

	}

	/*
	 * This is the core function to convert Tree to list. This function follows
	 * steps 1 and 2 of the above algorithm
	 */

	Node bintree2listUtil(Node node) {

		// Base case
		if (node == null) {
			return node;
		}

		// Convert the left subtree and link to root
		if (node.left != null) {

			// Convert the left subtree
			Node left = bintree2listUtil(node.left);

			// Find inorder predecessor. After this loop, left
			// will point to the inorder predecessor
			for (; left.right != null; left = left.right);

			// Make root as next of the predecessor
			if(left != null) 
		    	left.right = node;

			// Make predecssor as previous of root
			node.left = left;
		}

		// Convert the right subtree and link to root
		if (node.right != null) {

			// Convert the right subtree
			Node right = bintree2listUtil(node.right);

			// Find inorder successor. After this loop, right
			// will point to the inorder successor
			for (; right.left != null; right = right.left)
				;

			// Make root as previous of successor
			right.left = node;

			// Make successor as next of root
			node.right = right;
		}

		return node;
	}

	// The main function that first calls bintree2listUtil(), then follows step
	// 3
	// of the above algorithm

	Node bintree2list(Node node) {

		// Base case
		if (node == null) {
			return node;
		}

		// Convert to DLL using bintree2listUtil()
		node = bintree2listUtil(node);

		// bintree2listUtil() returns root node of the converted
		// DLL. We need pointer to the leftmost node which is
		// head of the constructed DLL, so move to the leftmost node
		while (node.left != null) {
			node = node.left;
		}

		return node;
	}

	/* Function to print nodes in a given doubly linked list */
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.right;
		}
	}

}
