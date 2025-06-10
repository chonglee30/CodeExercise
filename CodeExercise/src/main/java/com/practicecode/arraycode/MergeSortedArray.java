package com.practicecode.arraycode;

import java.util.Arrays;

public class MergeSortedArray {

	// My Initial Attempt:
	/*
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int ptr1 =0, ptr2 =0, arrPtr=0;
		
		if (m==0) {
			nums1 = Arrays.copyOf(nums2, nums2.length);
		} else if (n==0) {
			// no need anything
		} else {
			int [] arr = new int[m+n];
			
			while ((ptr1 < m) || (ptr2 < n)) {
				System.out.println("ptr1:"+ptr1);
				System.out.println("ptr2:"+ptr2);
				if (nums1[ptr1] < nums2[ptr2]) {
					arr[arrPtr] = nums1[ptr1];
					arrPtr++;
					if (ptr1 < (m-1)) {
						ptr1++;
					}
				} else if (nums1[ptr1] > nums2[ptr2]) {
					arr[arrPtr] = nums2[ptr2];
					arrPtr++;
					if (ptr2 < (n-1)) {
						ptr2++;
					}
				} else if (nums1[ptr1] == nums2[ptr2]) {
					arr[arrPtr] = nums2[ptr2];
					arrPtr++;
					ptr2++;
					arr[arrPtr] = nums1[ptr1];
					arrPtr++;
					ptr1++;		
				}	
				
				if (nums1[m-1] < nums2[ptr2]) {
					arr[arrPtr] = nums2[ptr2];
					arrPtr++;
					ptr2++;
				} else if (nums2[n-1] < nums1[ptr1]) {
					arr[arrPtr] = nums1[ptr1];
					arrPtr++;
					ptr1++;
				}
			}
			System.out.println(Arrays.toString(arr));
		}	 
    } */
	
	// My 2nd Attempt: somehow ran into error on Test Case#3 - but ok on my end
	/*
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int ptr1 =0, ptr2 =0;
		//System.out.println(Arrays.toString(nums1));
		
		if (m==0) {
			nums1 = Arrays.copyOf(nums2, nums2.length);
		} else if (n==0) {
			// no need anything
		} else {
			
		//System.out.println("Else Statement");	
		int target = nums1[m-1];	
		while ((ptr1 < nums1.length-1) && ptr2 < nums2.length-1 ) {
			if (nums1[ptr1] > nums2[ptr2]) {
				for (int i=nums1.length-1; i> ptr1; i--) {
					nums1[i] = nums1[i-1];
				}
				nums1[ptr1] = nums2[ptr2];
				ptr2++;
				ptr1++;
			} else {
				//System.out.println("ptr1:"+ptr1);
				//System.out.println("ptr2:"+ptr2);
				ptr1++;
			}
			if ((nums1[ptr1] == target) && nums1[ptr1] <= nums2[ptr2]) {
				while (ptr1 < nums1.length) {
						ptr1++;
					if ((ptr1 < nums1.length) && (ptr2 < nums2.length) ) {
						nums1[ptr1] = nums2[ptr2];
					}
						ptr2++;
				}
			}
		}
		}
		//System.out.println("ptr1:"+ptr1);
		//System.out.println("ptr2:"+ptr2);
		System.out.println(Arrays.toString(nums1));
	} */
	
	// Youtube Hint
	// 1. Insert highest number 
	// 2. Fill in the rest of numbers
	// LeetCode 88. Merge Sorted Array
	// https://leetcode.com/problems/merge-sorted-array/description/
	// Leetcode University: https://www.youtube.com/watch?v=8CdySAPnEGY
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int ptr = n+m-1; // insert
		int ptr1 =m-1, ptr2 =n-1;
		
		while ((ptr1 >=0) && (ptr2 >=0)) {
			if (nums1[ptr1] > nums2[ptr2]) {
				nums1[ptr] = nums1[ptr1];
				ptr--;
				ptr1--;
			} else { // (nums1[ptr1] < nums2[ptr2])
				nums1[ptr] = nums2[ptr2];
				ptr--;
				ptr2--;
			}
		}
		
		while (ptr2 >=0) { // fill in the rest - Test Case#4
			nums1[ptr] = nums2[ptr2];
			ptr--;
			ptr2--;
		}
		//System.out.println(Arrays.toString(nums1));
	}
	
	public static void main(String[] args) {
		// Test Case#1
		//int[] nums1 = {1,2,3,0,0,0}; 
		int m1 = 3; 
		//int[] nums2= {2,5,6}; 
		int n1 = 3;
		//merge(nums1, m1, nums2, n1);
		
		// Test Case#2
		//int [] nums1 = {1}; 
		int m2 = 1;  
		//int [] nums2 = {}; 
		int n2 = 0;
		//merge(nums1, m2, nums2, n2);
		
		// Test Case#3
		//int [] nums1 = {0}; 
		//int m3 = 0; 
		//int []nums2 = {1}; 
		int n3 = 1;
		//merge(nums1, m3, nums2, n3);	
		
		// Test Case#4
		int[] nums1 = {10,11,12,0,0,0}; 
		int m4 = 3; 
		int[] nums2= {1,2,3}; 
		int n4 = 3;
		merge(nums1, m4, nums2, n4);
		
	}

}
