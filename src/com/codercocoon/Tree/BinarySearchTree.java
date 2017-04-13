package com.codercocoon.Tree;

/**
 * This class represents some operations about binary search trees, especially
 * how to calculate the height, inserting an searching a value, finding the
 * lowest common ancestor.
 * 
 * @author contact@codercocoon.com.
 *
 */
public class BinarySearchTree {

	/**
	 * Postorder traversal.
	 * 
	 * @param root
	 *            : root of the tree.
	 */
	public void postOrder(Node root) {
		if (root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	/**
	 * Calculating the height of the tree.
	 * 
	 * @param root
	 *            : root of the tree.
	 */
	public int height(Node root) {
		if (root == null)
			return 0;

		int heightL = height(root.left);
		int heightR = height(root.right);

		if (heightL > heightR)
			return heightL + 1;
		else
			return heightR + 1;
	}

	/**
	 * Inserting value in a binary search tree.
	 * 
	 * @param root
	 *            : root of the tree.
	 */
	public Node insert(Node root, int _value) {

		if (root == null)
			return new Node(_value);

		if (_value < root.data) {
			root.left = insert(root.left, _value);
		}

		if (_value > root.data) {
			root.right = insert(root.right, _value);
		}

		return root;
	}

	/**
	 * Searching a value in a binary search tree.
	 * 
	 * @param root
	 *            : root of the tree.
	 */
	public boolean search(Node root, int _value) {
		boolean found = false;

		if (root == null)
			found = false;
		else if (root.data == _value)
			found = true;
		else if (_value < root.data)
			found = search(root.left, _value);
		else if (_value > root.data)
			found = search(root.right, _value);

		return found;
	}

	/**
	 * Finding the lowest common ancestor in a binary search tree.
	 * 
	 * @param root
	 *            : root of the tree.
	 */
	public Node findLCA(Node root, int v1, int v2) {
		if (root == null)
			return null;

		if (root.data == v1 || root.data == v2)
			return root;
		Node left = findLCA(root.left, v1, v2);
		Node right = findLCA(root.right, v1, v2);

		if (left != null && right != null)
			return root;

		return (left != null) ? left : right;
	}
}