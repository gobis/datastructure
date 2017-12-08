package com.linkedList;

public class FindLooping {

	public static void main(String[] args) {

		Node node1 = new Node(3, null);
		Node node2 = new Node(2, node1);
		Node node3 = new Node(1, node2);

		node1.setNext(node3);   // enable looping here
		
		Node head = node3;

		boolean loop = haslooping(head);
		System.out.println("Given linkedlist has looping "+loop);

	}

	public static boolean haslooping(Node head) {

		boolean looping = false;

		Node slow = head.next;
		Node fast = head.next.next;

		while (slow != null && fast != null) {

			if (slow == fast) {
				looping = true;
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

}
