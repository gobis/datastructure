package com.linkedList;


public class Node {
	int value;
	Node next;
	
	public Node(int val , Node next){
		this.value = val;
		this.next = next;
	}
	
	public void setNext(Node nextPtr){
		this.next = nextPtr;
	}
	
}
