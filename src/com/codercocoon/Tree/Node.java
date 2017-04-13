package com.codercocoon.Tree;

public class Node {
	int data;
	Node left;
	Node right;

	Node(int _data) {
		data = _data;
	}

	/**
	 * Creates the right child node.
	 * 
	 * @param _data
	 * @return the right child node created.
	 */
	public Node setRight(int _data) {
		right = new Node(_data);
		return right;
	}

	/**
	 * Creates the left child node.
	 * 
	 * @param _data
	 * @return the left child node created.
	 */
	public Node setLeft(int _data) {
		left = new Node(_data);
		return left;
	}
}
