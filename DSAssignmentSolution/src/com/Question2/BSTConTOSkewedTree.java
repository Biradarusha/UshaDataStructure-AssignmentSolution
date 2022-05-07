package com.Question2;


public class BSTConTOSkewedTree {
	

	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;
	
	static void ConverBSTToSkewed(Node root,int order) {
		if(root == null) {
			return;
		}
		
		
		if(order > 0) {
			ConverBSTToSkewed (root.right, order);
			
		}else
		{
			ConverBSTToSkewed (root.left, order);	
		}
		
		
		Node  rightNode = root.right;
		Node leftNode = root.left;
		
		
		if(headNode == null) {
			headNode = root;
			root.left = null;
			 prevNode = root;
		}else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
			
		}
		if(order > 0) {
			
			ConverBSTToSkewed(leftNode, order);
			
		}else
		{
			
			ConverBSTToSkewed(rightNode, order);
		}
	}
	
	
	static void traverseRightSkewed(Node root) {
		
		if(root == null) {
			return;
		}
		System.out.print(root.key + " ");
		traverseRightSkewed(root.right);
	}

	
	public static void main(String args[]) {
		
		BSTConTOSkewedTree BST = new BSTConTOSkewedTree();
		BST.node = new Node(50);
		BST.node.left = new Node(30);
		BST.node.right = new Node(60);
		BST.node.left.left = new Node(10);
		BST.node.right.left = new Node(55);
		
		
		int order = 0;
		ConverBSTToSkewed(node,order);
		traverseRightSkewed(headNode);
		
	}
	
}


