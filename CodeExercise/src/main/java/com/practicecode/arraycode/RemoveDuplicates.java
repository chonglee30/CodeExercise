package com.practicecode.arraycode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//import java.util.List;
//import java.util.ArrayList;

public class RemoveDuplicates {

	public RemoveDuplicates() {
		
	}
	
	public void removeDuplicatesUsingSet(int []array) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i=0; i<array.length; i++) {
			if (! set.contains(array[i]) ) {
				set.add(array[i]);
			}
		}
		
		int arrSize = set.size();
		int  removedArr[] = new int[arrSize];
		Iterator<Integer> iter = set.iterator();
		int index=0;
		
		while (iter.hasNext()) {
			removedArr[index] = iter.next();
			index++;
		}
		
		for (int i=0; i<removedArr.length; i++) {
			System.out.println("Removed Duplicate Array:"+removedArr[i]);
		}
	}
	
	
	public String removeDuplicateCharacter(String str) {
		char [] charArray = str.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for (char c : charArray) {
			//System.out.print(c);	
			if (!set.contains(c)) {
				set.add(c);
			} 
		}
		
		StringBuilder sb = new StringBuilder();
		
		Iterator<Character> itr = set.iterator();
		while (itr.hasNext()) {
			//System.out.print(itr.next());
			sb.append(itr.next());
		}
		
		return sb.toString();
	}
	
	// My Solution: using two pointers:
	// Leetcode: 26. Remove Duplicates from Sorted Array
	// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
	// https://www.youtube.com/watch?v=3bv3U4nZbM0
	/*public static int removeDuplicates(int[] nums) {
		int currentValue = nums[0];
		int currentPtr=1, uniquePtr=1;
		
		for (int i =1; i<nums.length; i++) {
			if (nums[currentPtr] != currentValue) {
				nums[uniquePtr] = nums[currentPtr];
				currentValue = nums[uniquePtr];
				uniquePtr++;
				currentPtr++;
			} else currentPtr++; // equal case
		}

		for (int num : nums) {
			System.out.println(num);
		}
		
		return uniquePtr;
    } */
	
	// After watching youtube link above - shorter and concise code
	public static int removeDuplicates(int[] nums) {
		int index =0;
		for (int i =0; i< nums.length; i++) {
			if (index ==0 || nums[index-1] != nums[i]) {
				nums[index] = nums[i];
				index++;
			}
		}
		return index;
	}
	
	// Leetcode 27. Remove Element
	// https://leetcode.com/problems/remove-element/
	// https://www.youtube.com/watch?v=TnnLkhubXiw
	// https://www.youtube.com/watch?v=ZYKDfL2av0Q
	//  My Solution:
	// Time Complexity: O(n) and Space Complexity: O(1)
	public static int removeElement(int[] nums, int val) {
		int current =0;
		int k =0;
		
		for (int i=0; i<nums.length; i++) {
			if (nums[current] == val) {
				current++;
			} else {  // not equal
				nums[k] = nums[current];  
				current++;
				k++;
			}
		}
		return k;
    }
	
	public static void main(String[] args) {
		
		int [] array= {7,5,7,17,5,8};
		
		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
		removeDuplicates.removeDuplicatesUsingSet(array);
		
		String str = "aaabbcdde";
		//System.out.println(removeDuplicates.removeDuplicateCharacter(str));
		
		int[] nums1 = {1,1,2};
		System.out.println("Unique Number:"+removeDuplicates(nums1));
		
		int []nums2 = {0,0,1,1,1,2,2,3,3,4};
		System.out.println("Unique Number:"+removeDuplicates(nums2));
		
		int [] nums11 = {3,2,2,3}; 
		int val11 = 3;
		removeElement(nums11, val11);
		
		int []nums12 = {0,1,2,2,3,0,4,2};
		int val12 = 2;
		removeElement(nums12, val12);	
	}
}
