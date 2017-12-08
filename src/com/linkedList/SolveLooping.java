package com.linkedList;

public class SolveLooping {
	
	static Node loopNode = null;
	
	public static void main(String[] args) {

		Node node1 = new Node(3, null);
		Node node2 = new Node(2, node1);
		Node node3 = new Node(1, node2);

		node1.setNext(node3);   // enable looping here
		
		Node head = node3;

		boolean loop = haslooping(head);
		System.out.println("Given linkedlist has looping "+loop);
		
		if(loop)
		  Solveloop(head,loopNode);
		
		PrintList(head);

	}

	
	public static boolean haslooping(Node head) {

		boolean looping = false;

		Node slow = head.next;
		Node fast = head.next.next;

		while (slow != null && fast != null) {

			if (slow == fast) {
				looping = true;
				loopNode = slow;
				break;
			}
			

			if (fast.next != null && fast.next.next != null) {
				fast = fast.next.next;
			}else {
				looping = false;
				break;
			}


			if (slow.next != null) {
				slow = slow.next;
			} else {
				looping = false;
				break;
			}

		}
		return looping;
	}
	
	
	public static void Solveloop(Node head,Node loopnode){
		
		
		Node node1 = loopnode;
		Node node2 = loopnode;
		
		// find number of nodes in the loop
		int loopCount = 1;
		
		
		while(node1.next == node2){
			node1 = node1.next;
			loopCount++;
		}
		
		Node NodeRef = head;
		for(int i =0 ;i<loopCount ; i++){
			NodeRef = NodeRef.next;
		}
		
		Node Prev = head;
		while(NodeRef != head){
			Prev = head;
			NodeRef = NodeRef.next;
			head = head.next;
		}
		
		Prev.next = null;
		/*Node master = loopnode;
		
		while(true){
			
			if(loopnode.next == master){
			loopnode.next = null;
			break;
			}
			loopnode = loopnode.next;
		}*/
		
		
	}
	
	
	public static void PrintList(Node head){

		while(head != null){
			System.out.println(head.value);
			head = head.next;
		}
		
	}
	
	

}
