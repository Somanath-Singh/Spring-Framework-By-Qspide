package com.nt.impl;

import com.nt.second.node.Node;

public class DoublyLinkedList<T> {
	
	Node head;
	int count; 
	
	public void addFirst(T data) {
		
		Node n=new Node(data);
		
		if(head == null) {
			head=n;
		}else {
			head.previous=n;
			n.next=head;
			head=n;
		}
		count++;
	}
	
	public void addLast(T data) {
		
		Node n=new Node(data);
		
		if(head == null) {
			head=n;
		}else {
			Node temp=head;
			while(temp.next != null) {
				temp=temp.next;
			}
			temp.next=n;
			n.previous=temp;
			count++;
		}
	}
	
	public void removeFirst() {
		if(head == null) {
			System.out.println("LinkedList is empty ..");
		}else {
			head=head.next;
			head.previous=null;
			count--;
		}
	}
	
	public void removelast() {
		if(head == null) {
			System.out.println("LinkedList is empty ..");
		}else {
			Node temp=head;
			for(int i=1;i<count-1;i++) {
				temp=temp.next;
			}
			temp.next=null;
		}
	}
	
	
	
	public void printNode() {
		if(head == null) {
			System.out.println("LinkedList is empty ..");
		}else {
			Node temp=head;
			while(temp != null) {
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.println("NULL");
		}
	}
	
	public void printNodeWithAddress() {
		if(head == null) {
			System.out.println("LinkedList is empty ..");
		}else {
			Node temp=head;
			while(temp != null) {
				System.out.print("["+temp.previous+"|"+ temp.data+"|"+temp.next+"]->");
				temp=temp.next;
			}
			System.out.println("NULL");
		}
	}

}
