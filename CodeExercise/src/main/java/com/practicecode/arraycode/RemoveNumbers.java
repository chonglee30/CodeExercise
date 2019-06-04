package com.practicecode.arraycode;

import java.util.Arrays;

public class RemoveNumbers {
	
	private int countEvenNumber(int [] array) {
		int countEven =0;
		
		for (int i=0; i<array.length; i++) {
			if ((array[i]%2)==0) {
				countEven++;
			}
		}
		return countEven;
	}
	
	private boolean isOddNumber(int number) {
		if ((number%2) != 0) {
			return true; 
		} 
		return false;
	}

	// Pseudo Code:
	// 1. Reduce the size of array: (original length - numbers of evens)
	// 2. Include only odd numbers to new array
	public int[] removeEvenNumber(int [] array) {
		int originalLength = array.length;
		
		int reducedLength = originalLength - countEvenNumber(array);
		int [] reducedEvenArray = new int[reducedLength];
		int index =0;
		for (int i=0; i<originalLength; i++) {
			if (isOddNumber(array[i])) {
				reducedEvenArray[index] = array[i];
				index++;		
			}		
		}		
		return reducedEvenArray;
	}
	
	public static void main(String[] args) {
		int []array = {2,3,4,5,6,7,8,9,10};	
		RemoveNumbers removeEvenNum = new RemoveNumbers();
		System.out.println(Arrays.toString(removeEvenNum.removeEvenNumber(array)));
	}

}