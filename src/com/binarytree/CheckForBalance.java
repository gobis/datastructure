package com.binarytree;

public class CheckForBalance {

	// program to check the tree is balanced or not 
	
	// the left and right sub tree's height  of all nodes should not be more than 1 
	
	
	public static void main(String[] args) {

	}
	
	

	public static boolean Isbalanced(Node head){
		
		if(head == null){
			return true;
		}
		
		int lh = Height(head.left);
		int rh = Height(head.right);
		// find the height of the left sub tree and right subtree of given node 
		
		if(Math.abs(lh-rh) <= 1 && Isbalanced(head.left) && Isbalanced(head.right)){
			// call this function recursively to find out height of the each node 
			return true;
		}
		
		return false;
		
	}
	
	
	public static int Height(Node head){
		
		if(head == null){
			return 0;
		}else{
			return 1+ Math.max(Height(head.left),Height(head.right));
		}
		
	}
	
	
	
}
