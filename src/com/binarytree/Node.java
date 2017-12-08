package com.binarytree;


public class Node implements Comparable<Node> {
	
	public int val;
	public Node right;
	public Node left;
	
	
	public Node(int val, Node right,Node left){
		this.val = val;
		this.right = right;
		this.left = left;
	}


	@Override
	public int compareTo(Node o) {
       
		if(o.val > val)
			 return 1;
		else if(o.val < val)
			return -1;
		else
		return 0;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + val;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (val != other.val)
			return false;
		return true;
	}

	
	
	
}
