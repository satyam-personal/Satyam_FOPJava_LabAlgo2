package com.greatlearnings.lab3.bst;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;




public class BinarySearchTree {
	
	
	BSTNode root;
	
	public void insert(int data) {
		if (this.root == null) {
			this.root = new BSTNode(data);
		}
		insert(this.root, data);
	}
	
	private BSTNode insert (BSTNode node, int data) {
	
		if (node == null) {
			return new BSTNode(data);
		}
		if (data < node.data()) {
			node.left = insert(node.left(), data);
		}
		if (data > node.data()) {
			node.right = insert(node.right(), data);
		}
		return node;
	}
	
	public Set <Integer> findSumPair(int sum) {
		
		Set<Integer> values = new HashSet<>();
		Set<Integer> pair = new HashSet<>();
		traversePreOrder(this.root, sum,values, pair);
		return pair;
		
	}
	
	private boolean traversePreOrder(BSTNode node, int sum, Set<Integer> collectedValues, Set<Integer> pair) {
		
		if (node == null) return false;
		int nodeData = node.data();
		
		if (collectedValues.contains(sum - nodeData)) {
			pair.add(sum - nodeData);
			pair.add(nodeData);
			return true;
		}
		collectedValues.add(nodeData);
		if (node.left() != null && traversePreOrder(node.left(), sum,collectedValues, pair)) return true;
		if (node.right() != null && traversePreOrder(node.right(), sum,collectedValues, pair)) return true;
		
		return false;
	}
	
	public static void main (String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(40);
		bst.insert(20);
		bst.insert(10);
		bst.insert(30);
		bst.insert(60);
		bst.insert(50);
		bst.insert(70);
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please enter the sum");

			int sum = scanner.nextInt();
			Set<Integer> pair = bst.findSumPair(sum);
			if (pair.isEmpty())
				System.out.println("Nodes not found");
			else
				System.out.println("The Nodes are :" + pair.toString());
		}
		
	}

}
