package com.nt.array;

import com.nt.arrayInterface.ArrayInterafece;
import com.nt.main.ArrayImpl;

public class Main {

	public static void main(String[] args) {
		
		ArrayInterafece array=new ArrayImpl();
		
		array.reverseArray(new int[] {1,2,5,8,9,6,3,4});
		
		array.lowestAndHighest(new int[] {1,2,5,8,9,6,3,4,0});

		array.repeatedElementInArray(new int[] {1,2,5,8,9,1,2,5,5,5,6,3,4,0});
		
		array.secondHighestAndLowest(new int[] {1,2,5,8,9,6,3,4,0});
		
		array.leftShift(new int[] {1,2,5,8,9,6,3,4,0});
		
		array.rightShift(new int[] {1,2,5,8,9,6,3,4,0});
		
		array.insertElementAtAnyPosition(new int[] {1,2,5,8,9,6,3,4,0},4,525);
	}

}
