package com.nt.impl;

import com.nt.single.node.Node;

public class SingleLinkedList<T> {

	Node head;
	int count;

	// add node at first position
	public void addFirst(T data) {

		Node n = new Node(data);
		if (head == null) {
			head=n;
		} else {
			n.next=head;
			head=n;
		}
		count++;
	}

	// add node at last position
	public void addLast(T data) {

		Node n = new Node(data);
		count++;
		if (head == null) {
			head = n;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = n;
	}

	// print all element
	public void printNode() {

		if (head == null) {
			System.out.println("LinkedList is empty ..");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}

	// delete first node
	public void removeFirst() {
		if (head == null) {
			System.out.println("LinkedList is empty ..");
			return;
		}
		head = head.next;
		count--;
	}

	// delete last node
	public void removeLast() {
		if (head == null) {
			System.out.println("LinkedList is empty ..");
			return;
		}
		count--;
		if (head.next == null) {
			head = null;
			return;
		}
		Node temp = head;
		for (int i = 1; i <= count - 1; i++) {
			temp = temp.next;
		}
		temp.next = null;
	}

	// add node at n position
	public void addNodeAt(int index, T data) {
		if (index < 0 || index >= count) {
			System.out.println(
					"LinkedList contains " + count + " nodes .Add node between 0 to " + (count - 1) + " position");
			return;
		}
		Node n = new Node(data);
		if (index == 0) {
			n.next=head;
			head=n;
		} else {
			Node temp = head;
			for (int i = 0; i < index-1; i++) {
				temp = temp.next;
			}
			n.next = temp.next;
			temp.next=n;
		}
		count++;
	}
	
	//remove node at n position
	public void removeNodeAt(int index) {
		if(index < 0 || index >= count) {
			System.out.println("LinkedList contains " + count + " nodes .Add node between 0 to " + (count - 1) + " position");
			return;
		}
		if(index == 0) {
			head=head.next;
		}else {
			Node temp=head;
			for(int i=0;i<index-1;i++) {
				temp=temp.next;
			}
			Node remove = temp.next;
			temp.next=remove.next;
		}
		count--;
	}
	
	public int size() {
		return count;
	}

}
