package com.nt.string;

import java.util.Arrays;

public class SortArray {

	//sort array
	public static void sortArray(int arr[]) {

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));

	}
	
	//largest and smallest
	public static void largestAndSmallest(int arr[])
	{
		int lar=arr[0];
		int sml=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > lar)
			{
				lar=arr[i];
			}
			
			if(arr[i] < lar)
			{
				sml=arr[i];
			}	
			
		}
		
		System.out.println("largest no:"+lar+" smallest no:"+sml);
	}
	
	//second largest
	public static void secondLargest(int arr[])
	{
		int lar=Integer.MIN_VALUE;
		int sec_lar=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > lar)
			{
				sec_lar=lar;
				lar=arr[i];
			}
			else if(arr[i] > sec_lar && arr[i] != lar)
			{
				sec_lar=arr[i];
			}
		}
		
		System.out.println(lar+" "+sec_lar);
		
		
	}
	
	//odd even arrays
	public static void oddAndEven(int arr[])
	{
		int e=0;
		int o=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 == 0)
			{
				e++;
			}
			else
			{
				o++;
			}
		}
		
		int even[]=new int[e];
		int odd[]=new int[o];
		
		int j=0,k=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 == 0)
			{
				even[j]=arr[i];
				j++;
			}
			else
			{
				odd[k]=arr[i];
				k++;
			}
		}
		
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
	}
	
	//rotate array
	public static void rotateArray(int arr[])
	{
		int middle=arr.length/2;
		
		int arr1[]=new int[arr.length];
		
		int j=0;
		
		for(int i=middle;i>=0;i--)
		{
			System.out.println(j);
			arr1[j]=arr[i];
			j++;
		}
		
		System.out.println(j);
		
		for(int i=arr.length-1;i>middle;i--)
		{
			System.out.println("1");
			arr1[j]=arr[i];
			j++;
		}
		
		System.out.println("rotate arrays"+Arrays.toString(arr1));
		
	}

	//main method
	public static void main(String[] args) {

		int arr[] = new int[] { 1, 9, 5, 8, 3, 7, 4, 5 };
		
		sortArray(arr);
		
		largestAndSmallest(arr);
		
		secondLargest(arr);
		
		
		rotateArray(arr);
		
		oddAndEven(arr);

	}

}
