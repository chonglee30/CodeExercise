package com.practicecode.arraycode;

import java.util.Arrays;

public class FindMissingNumber {
	
	public static Integer findMissingNumberLinear(int [] array) {
		int size = array.length;
		Arrays.sort(array);
		Integer missingNum=null;
		 
		for (int i=0; i<size; i++) {
			if (array[i] != (i)) {
				missingNum = (i);
				return missingNum;
			}
		}
		return missingNum;
	}
	
	// Try Later:
	/*public static int findMissingNumberBinary(int [] array) {

		int size = array.length;
		Arrays.sort(array);
		Integer missingNum = null;
		
		int initialNum =0;
		int lastNum = array.length-1;
		int mid =0;
		
		while (initialNum < lastNum) {
			mid = (initialNum + lastNum)/2;
			
			if (array)
		}
		
		
	} */


	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("First Missing Number: "+findMissingNumberLinear(array));
		
	}

}
