package com.binarytree;

import java.util.ArrayList;
import java.util.List;

public class ShowLeftNodesInTree {

	
	public static void main(String[] args) {

		Node node1 = new Node(8, null, null);
		Node node10 = new Node(55, null, null);
		Node node2 = new Node(12, null, node10);
		Node node3 = new Node(17, null, null);
		Node node4 = new Node(19, null, null);
		Node node5 = new Node(10, node2, node1);
		Node node6 = new Node(18, node4, node3);
		Node node7 = new Node(15, node6, node5);
		Node node8 = new Node(22, null, null);
		Node node9 = new Node(20, node8, node7);
		
		
		
/*		             
 *                        20
		             15            22
		        10        18
		     8    12    17   19 
		             55
		     */

		Node head = node9;
		Node lca = null;

		int firstNode = 8;
		int secondnode = 22;

		
		List<Node> resultList = new ArrayList<Node>();
		showLeftNode(head,0,resultList);

	}
	
	public static int leftLevelVisited = 0; 
	
	public static boolean showLeftNode(Node head, int currentLevel, List<Node> result){
		
		if(head == null) return false;
		
//		System.out.println("head "+ head.val  + "   current level "+ currentLevel
//				+ "   level visited "+ leftLevelVisited);
//		
		if(currentLevel >=  leftLevelVisited ){
			result.add(head);
			System.out.println(head.val);
			leftLevelVisited++;
		}
		
		showLeftNode(head.left, currentLevel+1, result);
		showLeftNode(head.right, currentLevel+1, result);
		return false;
		
	}
	
}
