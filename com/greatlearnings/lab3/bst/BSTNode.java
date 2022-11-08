package com.greatlearnings.lab3.bst;

public class BSTNode {
    
	BSTNode left;
    int data;
    BSTNode right;
	
    public BSTNode(int data) {
		super();
		this.data = data;
	}
	public BSTNode left() {
		return left;
	}
	public int data() {
		return data;
	}
	public BSTNode right() {
		return right;
	}
	
}
