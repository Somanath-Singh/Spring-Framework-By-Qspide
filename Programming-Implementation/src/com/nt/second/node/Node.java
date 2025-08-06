package com.nt.second.node;

public class Node {

	public Object data;
	public Node next;
	public Node previous;

	public Node(Object data) {
		this.data = data;
		this.next = null;
		this.previous = null;
	}

	@Override
	public String toString() {
		return "ox"+data;
	}
	
	

}
