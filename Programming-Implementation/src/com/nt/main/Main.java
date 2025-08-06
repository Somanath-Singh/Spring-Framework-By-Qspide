package com.nt.main;

import com.nt.impl.ArrayList;
import com.nt.impl.DoublyLinkedList;
import com.nt.impl.SingleLinkedList;
import com.nt.impl.Queue;
import com.nt.impl.Stack;

public class Main {

	public static void main(String[] args) {

		// ArrayList
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("2");
		arrayList.add("1");
		arrayList.add("20");
		System.out.println(arrayList.get(0));

		System.out.println(arrayList);

		System.out.println("=======================================================================");

		// Stack
		Stack<String> stack = new Stack<String>();

		// add element
		stack.push("12");
		stack.push("2");
		stack.push("15");
		stack.push("17");
		stack.push("9");

		System.out.println(stack.size());

		System.out.println(stack);
		// peek()
		System.out.println(stack.peek());
		// pop()
		System.out.println(stack.pop());
		System.out.println(stack.size());

		System.out.println(stack);
		System.out.println(stack.peek());

		// isEmpty()
		System.out.println(stack.isEmpty());
		// search(t)
		System.out.println(stack.search("15"));
		// capacity()
		System.out.println(stack.capacity());

		System.out.println("=======================================================================");

		// Queue
		Queue<String> queue = new Queue<String>();

		// add
		queue.offer("Somanath");
		queue.offer("22");
		queue.offer("Jatani");
		queue.offer("752050");

		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());

		// remove
		System.out.println(queue.pool());

		System.out.println(queue);
		System.out.println(queue.size());

		// peek
		System.out.println(queue.peek());

		// contains
		System.out.println(queue.contains("Somanath"));
		System.out.println(queue.contains("Jatani"));

		// clear
		queue.clear();

		System.out.println(queue.size());
		System.out.println(queue.isEmpty());

		System.out.println("=======================================================================");

		SingleLinkedList<Integer> ll = new SingleLinkedList<>();

		// add first
		ll.addFirst(12);
		ll.addFirst(24);
		ll.addFirst(10);

		// print
		ll.printNode();

		// add last
		ll.addLast(40);
		ll.addLast(23);

		// print
		ll.printNode();

		// remove first
		ll.removeFirst();

		ll.printNode();

		// remove last
		ll.removeLast();

		ll.printNode();

		// add node at any position
		ll.addNodeAt(0, 8);
		ll.printNode();
		ll.addNodeAt(1, 54);
		ll.printNode();
		ll.addNodeAt(4, 27);
		ll.printNode();

		// remove node at any position
		ll.removeNodeAt(5);
		ll.printNode();

		// size of linkedlist
		System.out.println(ll.size());
		
		System.out.println("=======================================================================");
		
		DoublyLinkedList<Integer> dll=new DoublyLinkedList<Integer>();
		
		dll.addFirst(25);
		dll.addFirst(35);
		dll.addFirst(75);
		dll.addFirst(31);
		
		dll.printNode();
		
		dll.addLast(10);
		dll.addLast(13);
		
		dll.printNode();
		
		dll.removeFirst();
		
		dll.printNode();
		
		dll.removelast();
		
		dll.printNode();
		
		dll.printNodeWithAddress();
		
		
	}
}
