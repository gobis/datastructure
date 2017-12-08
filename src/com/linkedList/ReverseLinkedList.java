package com.linkedList;

import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String []args){
		
	Node node1 = new Node(3, null);
	Node node2 = new Node(2, node1);
	Node node3= new Node(1,node2);
	
	Node head = node3;
	
	
	
	}
	
	
	public static void reverseLinkedList(Node head){
		
		Node nextRef = null;
		
		while(head != null){
			
			Node temp = head.next;
			head.next = nextRef;
			nextRef = head;
			head = temp;
		}
		
	}
	
	
	public static Node reverseList(Node head){
		
		if(head == null)
			return head;
		
		 Node elem =reverseList(head.next);
		 
		 if(null != elem){
			 elem.next = head;
		 }
		
		 return head;
		 
	}
	
	

}
