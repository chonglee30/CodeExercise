package com.practicecode.linkedlistcode;



public class Node {
	private Node next;
	private String data;
	
	public Node (String data) {
		this.data = data;
		next = null;
	}
	
	public Node getNextNode() {
		return next;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
}
