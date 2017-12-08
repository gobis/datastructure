package com.binarytree;

public class CommonAncestorGivenNodes {
	
	// problem given binary search tree and find common ancestor 
	
	public static void main(String[] args) {
		
		Node node1 = new Node(8,null,null);
		Node node2 = new Node(12,null,null);
		Node node3 = new Node(17,null,null);
		Node node4 = new Node(19,null,null);
		Node node5 = new Node(10,node2,node1);
		Node node6 = new Node(18,node4,node3);
		Node node7 = new Node(15,node6,node5);
		Node node8 = new Node(22,null,null);
		Node node9 = new Node(20,node8,node7);
		
		Node head = node9;
		Node lca = null;
		lca = LowestCommonAncestorWORecur(head,8,17);
//		lca = LowestCommonAncestor(head,8,17);
		System.out.println(lca.val);
	}
	
	
	private static Node LowestCommonAncestor(Node head,int val1, int val2){
		
		if(head == null) return head;
		
		if(head.val > val1 && head.val > val2){
			return LowestCommonAncestor(head.left,val1,val2);
		}
		
		if(head.val < val1 && head.val < val2){
			return LowestCommonAncestor(head.right,val1,val2);
		}
		
		return head;
	}
	
	
    private static Node LowestCommonAncestorForBinaryTree(Node head,int val1, int val2){
		
		if(head == null) return head;
		
		if(head.val == val1 || head.val == val2) return head;

		Node left = LowestCommonAncestorForBinaryTree(head.left,val1,val2);
		Node right = LowestCommonAncestorForBinaryTree(head.right,val1,val2);
		
    	if(left != null && right != null) return head;
    	if(left == null && right == null) return null;
    	if(left != null) return left;
    	if(right != null) return right;
    	
    	return head;
	}
	
	
	private static Node LowestCommonAncestorWORecur(Node head, int val1, int val2) {

		boolean breakloop;
		while (head != null) {

			breakloop = true;
			
			if (head.val > val1 && head.val > val2) {
				if(head.left != null)
				   head = head.left;
				
				breakloop = false;
			}
			if (head.val < val1 && head.val < val2) {
				if(head.right != null)
				    head = head.right;
				breakloop = false;
			}

			if(breakloop)break;
			
		}

		return head;
	}
	

}
