package com.binarytree;

import java.util.Stack;

public class Traversal {
	
	
	// major classification   Depth first search and breath first search 
	
	// Depth first search : preOrder ,inOrder , PostOrder
	
	
	// PreOrder : visit root, visit left , visit right 
	// InOrder : Visit Left , visit root, visit right 
	// Post order :  visit right ,Visit Left , visit root  

	
	
	// KEY IDEA :  DFS : used stack   BFS : used queue (zigzag traversal)
	
	public static void main(String[] args) {

		Node node1 = new Node(8, null, null);
		Node node2 = new Node(12, null, null);
		Node node3 = new Node(17, null, null);
		Node node4 = new Node(19, null, null);
		Node node5 = new Node(10, node2, node1);
		Node node6 = new Node(18, node4, node3);
		Node node7 = new Node(15, node6, node5);
		Node node8 = new Node(22, null, null);
		Node node9 = new Node(20, node8, node7);

		Node head = node9;

		// PreOrderTraversal(head);
//		InOrderTraversal(head);
		
		// PostOrderTraversal(head);
		InorderWithoutRecur(head);

	}
	
	
	// pre order traversal

	private static void PreOrderTraversal(Node head) {
		
           System.out.println(head.val);
           
           if(head.left != null )
           PreOrderTraversal(head.left);
           
           if(head.right != null )
           PreOrderTraversal(head.right);
           
	}

	private static void InOrderTraversal(Node head) {
		 
		if(head.left != null )
			InOrderTraversal(head.left);
		 
         System.out.println(head.val);
        
         if(head.right != null )
        	 InOrderTraversal(head.right);
	}

	private static void PostOrderTraversal(Node head) {
		
		 if(head.left != null )
			 PostOrderTraversal(head.left);
		 
		 if(head.right != null )
			 PostOrderTraversal(head.right);
		 
         System.out.println(head.val);
	}
	
	
	private static void InorderWithoutRecur(Node head) {

		Stack stack = new Stack<Node>();

		while (head != null) {
			stack.push(head);
			head = head.left;
		}

		head = (Node) stack.pop();
		
		System.out.println(head.val);
		

		while (!stack.isEmpty()) {
			
			head = (Node) stack.pop();
			System.out.println(head.val);
			
			head = head.right;
			
			while (head != null) {
				stack.push(head);
				head = head.left;
			}

		}

	}
	
	
	private static void BreadthFirstSearch(Node head){
		
	}
	
	
}
