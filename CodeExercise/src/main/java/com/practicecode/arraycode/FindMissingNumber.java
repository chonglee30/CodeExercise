package com.practicecode.arraycode;

import java.util.Arrays;
import java.util.Scanner;

public class FindMissingNumber {

	// Try Later:
	// Solution2: Binary Search
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
	
	// Solution1: Linear
	public Integer findMissingNumberLinear(int [] array) {
		int size = array.length;
		Arrays.sort(array);
		Integer missingNum=null;
		 
		for (int i=1; i<=size; i++) {
			if (array[i-1] != (i)) {
				missingNum = (i);
				return missingNum;
			}
		}
		return missingNum;
	}
	
	// Print Missing Number:
	public void printMissingNumbers() {
		Scanner in = new Scanner(System.in);
		
		int length = in.nextInt();
		int []array = new int[length];
		
	    for (int i=0; i<length; i++) {
	           array[i] = in.nextInt();
	    }

	    if (findMissingNumberLinear(array)==null) {
			System.out.println("No Missing Number");
		} else {
			System.out.println("First Missing Number: "+findMissingNumberLinear(array));
		}
	    
	    in.close();
	}

	public static void main(String[] args) {
		FindMissingNumber findMissingNum = new FindMissingNumber();
		findMissingNum.printMissingNumbers();
	}

}