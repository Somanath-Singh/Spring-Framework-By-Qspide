package com.nt.impl;

import java.util.Arrays;

public class ArrayList<T> {

	private Object arr[] = new Object[10];
	private int count = 0;

	public void add(T element) {

		increaseSize();
		arr[count] = element;
		count++;
	}

	public int size() {
		return count;
	}

	public boolean isEmpty() {

		if (arr.length == 0) {
			return true;
		}
		return false;
	}

	public T get(int index) {
		return (T)(arr[index]);
	}

	public void set(int index, T element) {

		checkIndex(index);
		for (int i = count - 1; i >= index; i--) {
			arr[i + 1] = arr[i];
		}
		arr[index] = element;
		count++;

	}

	public T remove(int index) {

		checkIndex(index);
		Object element = arr[index];
		for (int i = index; i < count; i++) {
			arr[i] = arr[i + 1];
		}
		arr[count - 1] = 0;
		count--;
		return (T)element;
	}

	public void add(int index, T element) {
		checkIndex(index);
		increaseSize();
		for (int i = count - 1; i >= index; i--) {
			arr[i + 1] = arr[i];
		}
		arr[index] = element;
		count++;
	}

	public void checkIndex(int index) {

		if (index < 0 || index >= count) {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public void increaseSize() {

		if(arr.length == count) {
			Object newarr[] = new Object[arr.length * 2];
			for (int i = 0; i < count; i++) {
				newarr[i] = arr[i];
			}
			arr = newarr;
		}
	}

	public String toString() {
		return "ArrayList [arr=" + Arrays.toString(arr) + "]";
	}

}
