package com.nt.LinkedList;

public class LL {
	
	Node head;
	
	
	//add node at first position
	void addNodeFirst(int data)
	{
		Node n=new Node(data);
		Node.size ++;
		
		if(head == null)
		{
			head=n;
			return;
		}
		
		n.next=head;
		head=n;
	}
	
	//add node at last position
	void addNodeLast(int data)
	{
		Node n=new Node(data);
		Node.size ++;
		
		if(head == null)
		{
			head=n;
			return;
		}
		
		Node temp=head;
		
		while(temp.next != null)
		{
			temp=temp.next;
		}
		
		temp.next=n;
		
	}
	
	//print all linkedlist element
	void printNode()
	{
		if(head == null)
		{
			System.out.println("LinkedList is empty ..");
			return;
		}
		
		Node temp=head;
		
		while(temp != null)
		{
			System.out.print(temp.data+"  -->  ");
			temp=temp.next;
		}
		
		System.out.println("NULL");
		
	}
	
	//delete first node
	void deleteFirstNode()
	{
		if(head == null)
		{
			System.out.println("LinkedList is empty ..");
			return;
		}
		
		head=head.next;
		Node.size --;
	}
	
	//delete last node
	void deleteLastNode()
	{
		if(head == null)
		{
			System.out.println("LinkedList is empty ..");
			return;
		}
		
		Node.size --;
		
		if(head.next == null)
		{
			head=null;
			return;
		}
		
		Node n1=head;
		Node n2=head.next;
		
		while(n2.next != null)
		{
			n2=n2.next;
			n1=n1.next;
		}
		n1.next=null;
		
	}
	
	//add node at n position
	void addNodeAt(int pos,int data)
	{
		if(head == null)
		{
			System.out.println("LinkedList is empty ..");
			return;
		}
		
		if(head.next == null)
		{
			System.out.println("LinkedList contains 1 node add node at 2 position ..");
			return;
		}
		
		if(pos > Node.size)
		{
			System.out.println("LinkedList contains "+Node.size+" nodes .Add node between 1 to "+Node.size+" position");
			return;
		}
		
		Node n=new Node(data);
		Node.size ++;
		
		Node temp=head;
		for(int i=1;i<pos-1;i++)
		{
			temp=temp.next;
		}
		
		n.next=temp.next;
		temp.next=n;
		
	}
	
	//delete node at n position
	void deleteNodeAt(int pos)
	{
		if(head == null)
		{
			System.out.println("LinkedList is empty ..");
			return;
		}
		
		if(head.next == null)
		{
			System.out.println("LinkedList contains 1 node ");
			return;
		}
		
		if(pos > Node.size)
		{
			System.out.println("Node is not present at LinkedList");
			return;
		}
		
		Node n1=head;
		Node n2=head.next;
		for(int i=1;i<pos-1;i++)
		{
			n1=n1.next;
			n2=n2.next;
		}
		
		n1.next=n2.next;
		
		Node.size --;
		
	}	

}
