package com.binarytree;

/**
 * Solution Keep min, max for every recursion. Initial min and max is very small
 * and very larger number. Check if root.data is in this range. When you go left
 * pass min and root.data and for right pass root.data and max.
 */

public class IsTreeBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isBST(Node root) {
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isBST(Node root, int min, int max) {
		if (root == null) {
			return true;
		}
		if (root.val <= min || root.val > max) {
			return false;
		}
		return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
	}

}
