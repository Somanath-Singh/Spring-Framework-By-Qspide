package com.nt.impl;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Queue<T> {

//	1. Adding Elements
//	add(E e): Inserts element; throws exception if full.
//	offer(E e): Inserts element; returns false if full.

//	2. Removing Elements
//	remove(): Removes and returns head; throws exception if empty.
//	poll(): Removes and returns head; returns null if empty.

//	3. Retrieving Elements Without Removing
//	element(): Returns head; throws exception if empty.
//	peek(): Returns head; returns null if empty.

//	4. Other Useful Methods
//	size(): Returns queue size.
//	isEmpty(): Checks if queue is empty.
//	contains(Object o): Checks if element exists.
//	clear(): Removes all elements.

	private Object arr[] = new Object[10];
	private int count = 0;

	// offer(E e): Inserts element; returns false if full.
	public boolean offer(T element) {

		increaseSize();

		if (count == 0) {
			arr[0] = element;
		} else {
			for (int i = count - 1; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = element;
		}
		count++;

		return true;
	}

	// poll(): Removes and returns head; returns null if empty.
	public T pool() {

		T value = (T) arr[count - 1];

		arr[count - 1] = 0;
		count--;

		return value;
	}

	// peek(): Returns head; returns null if empty.
	public T peek() {
		checkIndex();
		return (T) arr[count - 1];
	}

	// size(): Returns queue size.
	public int size() {
		return count;
	}

	// isEmpty(): Checks if queue is empty.
	public boolean isEmpty() {
		if (count == 0) {
			return true;
		}
		return false;
	}

	// clear(): Removes all elements.
	public void clear() {

		arr = new Object[10];
		count = 0;

	}

	// contains(Object o): Checks if element exists.
	public boolean contains(T element) {
		for (int i = 0; i < count; i++) {
			if (element == arr[i]) {
				return true;
			}
		}
		return false;
	}

	private void increaseSize() {
		if (count == arr.length) {
			Object newarr[] = new Object[count * 2];
			for (int i = 0; i < count; i++) {
				newarr[i] = arr[i];
			}
			arr = newarr;
		}
	}

	private void checkIndex() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
	}

	
	@Override
	public String toString() {
		Object print[]=new Object[count];
		for(int i=0;i<count;i++) {
			print[i]=arr[i];
		}
		return Arrays.toString(print);
	}
	
	

}
