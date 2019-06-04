package com.practicecode.arraycode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

// Determine if there are any two integers in the array whose sum is equal to the given value.
 
public class SumOfTwoValues {
	
	// #1: Running Time: N^2
	public void twoSumValues(int[] array, int targetSum) {
		int arrayLength = array.length;
		
		for (int i=0; i<arrayLength; i++) {
			for (int j=(i+1); j<arrayLength; j++) {
				if ((array[i]+array[j]) == targetSum) {
					System.out.println("Using Loop: Two values of array equal to the Target Sum:" + array[i]+"&"+array[j]);
				}
			}
		}
	}
	
	// #2: Running Time: nLogN
	public void twoSumSortedArrayValues(int[] array, int targetSum) {
		int startIndex =0;
		int lastIndex = array.length -1;
		
		Arrays.sort(array);
	
		while (startIndex <lastIndex) {
			if ((array[startIndex]+array[lastIndex]) < targetSum) {
				startIndex++;
			} else if((array[startIndex]+array[lastIndex]) > targetSum) {
				lastIndex--;
			}
			if ((array[startIndex] + array[lastIndex])== targetSum) {
				System.out.println("Using Sorted values: Two values of array equal to the Target Sum:" + array[startIndex]+"&"+array[lastIndex]);
				startIndex++;
			}
			
			if ((lastIndex-startIndex) ==1) {
				break;
			}
		}
	}
	
	// #3: Running Time: N
	public void twoSumUsingHashSet(int [] array, int targetSum) {
		
		if (array.length <2) {
			return;
		}
		
		int arrSize = array.length;
		Set<Integer> set = new HashSet<Integer>(arrSize);
		
		for (int arrValue: array) {
			int other = targetSum-arrValue;
			
			if (!set.contains(other)) {
				set.add(arrValue);
			} else {
				System.out.println("Using HashSet: Two values of array equal to the Target Sum:" +arrValue+"&"+other);
			}
		}
	}
	
	
	public static void main(String[] args) {
		int targetSum = 9;
		int [] array = {5,7,1,2,8,4,3};
		
		SumOfTwoValues twoValuesSum = new SumOfTwoValues();
		twoValuesSum.twoSumValues(array, targetSum);
		twoValuesSum.twoSumSortedArrayValues(array,targetSum);
		twoValuesSum.twoSumUsingHashSet(array, targetSum);
	}

}