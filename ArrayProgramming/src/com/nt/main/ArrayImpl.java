package com.nt.main;

import java.util.Arrays;

import com.nt.arrayInterface.ArrayInterafece;

public class ArrayImpl implements ArrayInterafece {

	@Override
	public void reverseArray(int[] arr) {

		int i = 0, h = arr.length - 1;

		while (i < h) {
			int temp = arr[i];
			arr[i] = arr[h];
			arr[h] = temp;
			i++;
			h--;
		}

		System.out.println(Arrays.toString(arr));

	}

	@Override
	public void lowestAndHighest(int[] arr) {

		int low = arr[0], high = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (low > arr[i]) {
				low = arr[i];
			} else if (high < arr[i]) {
				high = arr[i];
			}
		}

		System.out.println("Lowest element :" + low + " Highest element :" + high);
	}

	@Override
	public void repeatedElementInArray(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int num1 = arr[i];
			if (num1 == -1) {
				continue;
			}
			int count = 1;

			for (int j = i + 1; j < arr.length; j++) {
				int num2 = arr[j];
				if (num1 == num2) {
					count++;
					arr[j] = -1;
				}
			}
			System.out.println(num1 + " is repeted :" + count);
		}

	}

	@Override
	public void secondHighestAndLowest(int[] arr) {

		int highest = Integer.MIN_VALUE;
		int secondhighest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (highest < arr[i]) {
				secondhighest = highest;
				highest = arr[i];
			} else if (secondhighest < arr[i] && highest != arr[i]) {
				secondhighest = arr[i];
			}
		}

		System.out.println("second highest element :" + secondhighest);

		int lowest = Integer.MAX_VALUE;
		int secondlowest = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (lowest > arr[i]) {
				secondlowest = lowest;
				lowest = arr[i];
			} else if (secondlowest > arr[i] && lowest != arr[i]) {
				secondlowest = arr[i];
			}
		}

		System.out.println("second lowest element :" + secondlowest);

	}

	@Override
	public void leftShift(int[] arr) {

		System.out.println("Old Array :" + Arrays.toString(arr));
		int temp = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}

		arr[arr.length - 1] = temp;
		System.out.println("New Array :" + Arrays.toString(arr));
	}

	@Override
	public void rightShift(int[] arr) {
		System.out.println("Old Array :" + Arrays.toString(arr));
		int temp = arr[arr.length - 1];

		for (int i = arr.length - 2; i >=0; i--) {
			arr[i+1] = arr[i];
		}

		arr[0] = temp;
		System.out.println("New Array :" + Arrays.toString(arr));
	}

	@Override
	public void rotateArrayNTimes(int[] arr) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertElementAtAnyPosition(int[] arr,int pos,int val) {
		
		int newarray[]=new int[arr.length+1]; 
		
		for(int i=0;i<pos;i++) {
			newarray[i]=arr[i];
		}
		
		newarray[pos-1]=val;
		
		for(int i=pos;i<arr.length;i++) {
			newarray[i]=arr[i-1];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newarray));
		
	}

}
