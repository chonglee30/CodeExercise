package com.practicecode.arraycode;

import java.util.Arrays;

// Leetcode #283. Move Zeroes
// https://leetcode.com/problems/move-zeroes/description/
// https://www.youtube.com/watch?v=k5lIW5XxC7g
// https://medium.com/@saikrishna.a.dev/leetcode-283-move-zeroes-a6ad22becb4c

public class MoveZeroes {
	// My Initial Thinking: not working in some situation
	/*
	public static void moveZeroes(int[] nums) {
        int numZeroes =0;
        
        for (int i =0; i<nums.length; i++) {
        	if (nums[i] ==0) numZeroes++;
        }
        
        //if (numZeroes == nums.length) System.out.println(Arrays.toString(nums));
        
        if (numZeroes <1) {
            System.out.println(Arrays.toString(nums));
            return;
        } 
        
        System.out.println("Initial Array: "+ Arrays.toString(nums));
        
        //Arrays.sort(nums);
        for (int i=0; i<(nums.length-numZeroes); i++) {
        	// Rotate array to the left	
        	if (nums[i] == 0) {
        		int temp = nums[0];
        		for (int j=0; j< nums.length-1; j++) {
        			nums[j] = nums[j+1];
        		}
        		nums[nums.length-1] = temp;
        	}
        	System.out.println(Arrays.toString(nums));
        } 
    } */
	
	// Hint I got from Youtube
	// 1. Fill in with nonzero to the left most array
	// 2. the rest of array: fill with zeros.
	public static void moveZeroes(int[] nums) {
		int numPosition =0;
		 
		for (int i=0; i<nums.length; i++) {
			 if (nums[i] != 0) {
				 nums[numPosition] = nums[i];
				 numPosition++;
			 }
		}
		while (numPosition < nums.length) {
			nums[numPosition] = 0;
			numPosition++;
		}
		System.out.println(Arrays.toString(nums));
	}
	
	public static void main(String[] args) {
		
		int []nums1 = {0,1,0,3,12};
		moveZeroes(nums1);

		int []nums2 = {0};
		moveZeroes(nums2);
		
		int [] nums3 = {2,1};
		moveZeroes(nums3);	
		
		int [] nums4 = {4,2,4,0,0,3,0,5,1,0};
		moveZeroes(nums4);	
		// Expected: [4,2,4,3,5,1,0,0,0,0]
		// Output: [1,2,3,4,4,5,0,0,0,0]		
	}
}
