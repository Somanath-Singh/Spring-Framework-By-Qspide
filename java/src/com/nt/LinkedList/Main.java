package com.nt.LinkedList;

public class Main {

	public static void main(String[] args) {

		LL l = new LL();

		l.addNodeFirst(10);
		l.addNodeFirst(20);
		l.addNodeFirst(30);

		l.printNode();
		System.out.println("LL size:" + Node.size);

		l.addNodeLast(40);
		l.addNodeLast(50);

		l.printNode();
		System.out.println("LL size:" + Node.size);

		l.deleteFirstNode();

		l.printNode();
		System.out.println("LL size:" + Node.size);

		l.deleteLastNode();

		l.printNode();
		System.out.println("LL size:" + Node.size);

		l.addNodeLast(30);
		l.addNodeLast(50);
		l.addNodeLast(90);
		l.addNodeLast(80);

		l.printNode();
		System.out.println("LL size:" + Node.size);

		l.addNodeAt(2, 60);

		l.printNode();
		System.out.println("LL size:" + Node.size);

		l.addNodeAt(7, 100);

		l.printNode();
		System.out.println("LL size:" + Node.size);
		
		l.addNodeAt(10, 100);

		l.printNode();
		System.out.println("LL size:" + Node.size);
		
		l.deleteNodeAt(5);
		
		l.printNode();
		System.out.println("LL size:" + Node.size);

	}

}
