package com.nt.impl;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Stack<T> {

	private Object arr[] = new Object[10];
	private int count = 0;

//	Stack Methods
//	push(E item): Inserts an element at the top.
//	pop(): Removes and returns the top element.
//	peek(): Returns the top element without removing it.
//	isEmpty(): Checks if the stack is empty.
//	search(Object o): Returns the position of an element (1-based index).
//	size(): Returns the total number of elements.
//	capacity(): Returns capacity to store elements
//	clear(): Removes all elements.

	// push(E item): Inserts an element at the top.
	public void push(T element) {
		increaseSize();
		arr[count] = element;
		count++;
	}

	// pop(): Removes and returns the top element.
	public T pop() {

		checkElements();
		@SuppressWarnings("unchecked")
		T val = (T) arr[count - 1];
		arr[count] = null;
		count--;
		return val;

	}

	public void increaseSize() {
		if (count == arr.length) {
			Object newarr[] = new Object[count * 2];

			for (int i = 0; i < count; i++) {
				newarr[i] = arr[i];
			}
			arr = newarr;
		}
	}

	// peek(): Returns the top element without removing it.
	public T peek() {
		checkElements();
		return (T) arr[count - 1];
	}

	// isEmpty(): Checks if the stack is empty.
	public boolean isEmpty() {
		if (count == 0) {
			return true;
		}
		return false;
	}

	// size(): Returns the total number of elements.
	public int size() {
		return count;
	}

	// search(Object o): Returns the position of an element (1-based index).
	public int search(T element) {

		for (int i = 0; i < count; i++) {
			if (arr[i] == element) {
				return i + 1;
			}
		}
		return 0;
	}

	// capacity(): Returns capacity to store elements
	public int capacity() {
		return arr.length;
	}

	// clear(): Removes all elements.
	public void clear() {
		arr = new Object[10];
		count = 0;
	}

	public void checkElements() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
	}

	public String printStack() {
		String print[] = new String[size()];
		for (int i = 0; i < count; i++) {
			print[i] = (String) arr[i];
		}
		return Arrays.toString(print);
	}

	@Override
	public String toString() {
		return printStack();
	}

}
