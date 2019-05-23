package com.practicecode.arraycode;

import java.util.Arrays;

public class FindMissingNumber {
	
	public static int findFirstMissingNumber(int [] array) {
		
		int size = array.length;
		Arrays.sort(array);
		int missingNum=0;
		
		for (int i=0; i<size; i++) {
			if (array[i] != (i+1)) {
				missingNum = (i+1);
				return missingNum;
			}
		}
		return missingNum;
	}
	

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		if (findFirstMissingNumber(array) ==0) {
			System.out.println("All Numbers are present");
		} else {
			System.out.println("First Missing Number: "+findFirstMissingNumber(array));
		}
		
	}

}
