package com.practicecode.linkedlistcode;

// Single Linked List:
/* A. Node Insertion:
 * 1) At the front of the linked list
 * 2) After a given node.
 * 3) At the end of the linked list.
 * Reference Site: https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/
 * 
 * B. Node Deletion:
 * 
 * Reference Site: https://www.geeksforgeeks.org/linked-list-set-3-deleting-node/
 * https://www.geeksforgeeks.org/delete-a-linked-list-node-at-a-given-position/
 */

public class LinkedListTest {

	public void addNodes(LinkedList list) {		
		list.pushNodeHead("LA");
		list.appendNodeEnd("NY");
		list.appendNodeEnd("Chicago");
		list.insertAfterGivenNode(list.getHeadNode().getNextNode(), "Houston");
		list.appendNodeEnd("Atlanta");
	}
		
	public void printAllNodes(LinkedList list) {
		list.printNodeValues();
	}
	
	public static void main(String[] args) {
		LinkedListTest listInsertion = new LinkedListTest();
		LinkedList list = new LinkedList();
		listInsertion.addNodes(list);
		listInsertion.printAllNodes(list);
		list.deleteNode(list.getHeadNode().getNextNode().getNextNode());
		listInsertion.printAllNodes(list);
		list.deleteAtPosition(2);
		listInsertion.printAllNodes(list);
	}
}

class LinkedList {	
	private Node head;
	//private Node tail;
	
	public LinkedList() {
	}
	
	public Node getHeadNode() {
		return head;
	}
	
	public void printNodeValues() {
		Node currNode = head;
		
		do {
			System.out.print(currNode.data+" ");
			currNode = currNode.next;
		} while (currNode != null); 
		System.out.println("");
		
	}
	
	// 1. Insertion:
	// 1) At the front of the linked list
	public void pushNodeHead(String data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	
	// 2) After a given node, insert new node.
	public void insertAfterGivenNode(Node previousNode, String data) {
			if (previousNode == null) {
				System.out.println("No Node to insert after");
				return;
			}
			Node newNode = new Node(data);
			newNode.next = previousNode.next;
			previousNode.next = newNode;
	}
	
	// 3) At the end of the linked list.
	public void appendNodeEnd(String data) {
		Node newNode = new Node(data);
		newNode.next = null;
		
		if (head == null) {
			head = newNode;
			return;
		}
		
		Node lastNode = head;
		while (lastNode.next !=null) {
			lastNode = lastNode.next;
		}
		lastNode.next = newNode;
	}
	
	// Deletion
	// 1) Delete Node
	public void deleteNode(Node deleteNode) {
		Node currNode = head;
		Node prevNode = head;
		
		while (currNode!=deleteNode) {
			currNode = currNode.next;
			
			if (currNode!=deleteNode) {
				prevNode = prevNode.next;
			}
		}
		prevNode.next = currNode.next;
		currNode.next = null;
	}
	
	// 2) Delete at a given position:
	public void deleteAtPosition(int position) {
		int currPos=0;
		Node currNode = head;
		Node prevNode = head;
		
		while (currNode != null) {
			currNode = currNode.next;
			currPos++;
			
			if (currPos==position) {
				break;
			}
			prevNode = prevNode.next;
		}
		
		prevNode.next = currNode.next;
		currNode.next = null;
	}
	
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
}