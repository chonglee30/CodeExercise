package com.practicecode.arraycode;

// Leetcode 896. Monotonic Array
// https://leetcode.com/problems/monotonic-array/
// https://medium.com/@_monitsharma/daily-leetcode-problems-896-monotonic-array-2ee6598cc89e
// https://www.youtube.com/watch?v=eZPwlEWMMtM

public class MonotonicArray {

	public static boolean isMonotonic(int[] nums) { 
	     boolean increasing = true, decreasing = true;     
	     for (int i=0; i<nums.length-1; i++) {    	 
	    	 increasing = increasing & nums[i] <= nums[i+1];
	    	 decreasing = decreasing & nums[i] >= nums[i+1];
	     }
	     return (increasing || decreasing);	     
	}
	  
	public static void main(String[] args) {
		int [] nums1 = {1,2,2,3};
		System.out.println(isMonotonic(nums1));
		
		int [] nums2 = {6,5,4,4};
		System.out.println(isMonotonic(nums2));
				
		int [] nums3 = {1,3,2};
		System.out.println(isMonotonic(nums3));
	}
}
