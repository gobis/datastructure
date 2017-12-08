package com.binarytree;

public class MirrorTree {
	
	
	public static void main(String[] args) {

		
	}
	
	// LST : Left Sub Tree   RST : Right Sub tree
	public static boolean isMirror(Node LSThead,Node RSThead){
		
		if(LSThead == null && RSThead == null){
			return true;
		}
		
		if(LSThead != null  && RSThead != null && LSThead.val == RSThead.val){
			
			return isMirror(LSThead.left,RSThead.right) && isMirror(LSThead.right,RSThead.left);
		}
		
		
		return false;
		
	}
}
