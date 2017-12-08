package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeHeight {
	
	
	public static void main(String[] args) {

	
	}
	

	private static int getTreeHeightWORecur(Node head){
		
		Queue queue = new LinkedList<Node>();
		
		queue.add(head);
		queue.add(null);

		int height = 0;
		
		while(!queue.isEmpty()){
			
			Node elem = (Node) queue.remove();
			
			if(elem == null){
				
				if(!queue.isEmpty())
				   queue.add(null);
				
				height++;
				
			}

			if(head.left != null) queue.add(head.left);
			if(head.right != null) queue.add(head.right);
		}

		return height;
	}
	
	
	private static int TreeHeight(Node head){
		if (head == null) {
            return 0;
        } else {
             
            /* compute the depth of each subtree */
            int lDepth = TreeHeight(head.left);
            int rDepth = TreeHeight(head.right);
 
            /* use the larger one */
            if (lDepth > rDepth) {
                return (lDepth + 1);
            } else {
                return (rDepth + 1);
            }
            
            // return 1+Math.max(lDepth,rDepth);
            
            
            // another method 
            
          //  return 1+ Math.max(TreeHeight(head.left),TreeHeight(head.right));
            
        }
	
	
	}
	
	
	
}
