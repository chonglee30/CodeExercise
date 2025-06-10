package com.practicecode.arraycode;

public class SingleNumber {

	// Leetcode 136. Single Number
	// https://leetcode.com/problems/single-number/description/
	// Hint: https://stackoverflow.com/questions/61336096/how-does-this-leetcode-solution-work-finding-a-single-number-in-an-array
	// https://www.youtube.com/watch?v=eXl0HBm2RrA&pp=ygUNI3NpbmdsZW51bWJlcg%3D%3D
	
	public static int singleNumber(int[] nums) {
    
		int result =0;
		for (int num : nums) {
			result^=num;
		}
		
		System.out.println(result);
		return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums1 = {2,2,1};
		singleNumber(nums1); 
		
		int [] nums2 = {4,1,2,1,2};
		singleNumber(nums2); 

		int [] nums3 = {1};
		singleNumber(nums3); 
		
	}

}
