package com.binarytree;

import java.util.Stack;

public class PathGivenNodes {

	public static void main(String[] args) {

		Node node1 = new Node(8, null, null);
		Node node2 = new Node(12, null, null);
		Node node3 = new Node(17, null, null);
		Node node4 = new Node(19, null, null);
		Node node5 = new Node(10, node2, node1);
		Node node6 = new Node(18, node4, node3);
		Node node7 = new Node(15, node6, node5);
		Node node8 = new Node(22, null, null);
		Node node9 = new Node(20, node8, node7);

		Node head = node9;
		Node lca = null;

		int firstNode = 8;
		int secondnode = 22;

		lca = LowestCommonAncestorWORecur(head, firstNode, secondnode);
		// lca = LowestCommonAncestor(head,firstNode,secondnode);
		System.out.println("Lowest common ancestor" + lca.val);

		FindShortestPath(lca, firstNode, secondnode);

	}

	private static Node LowestCommonAncestorWORecur(Node head, int val1, int val2) {

		boolean breakloop;
		while (head != null) {

			breakloop = true;

			if (head.val > val1 && head.val > val2) {
				if (head.left != null)
					head = head.left;

				breakloop = false;
			}
			if (head.val < val1 && head.val < val2) {
				if (head.right != null)
					head = head.right;
				breakloop = false;
			}

			if (breakloop)
				break;
		}

		return head;
	}

	private static void FindShortestPath(Node head, int val1, int val2) {

		Stack<Node> stack = new Stack<Node>();

		Node lca = head;

		while (head.val != val1) {
			stack.push(head);

			if (head.val > val1) {
				head = head.left;

			} else {
				head = head.right;
			}

		}

		stack.push(head);

		while (!stack.isEmpty()) {
			System.out.println(stack.pop().val);
		}

		head = lca;

		while (head.val != val2) {

			if (head.val > val2) {
				head = head.left;

			} else {
				head = head.right;
			}

			System.out.println(head.val);
		}

	}

}
