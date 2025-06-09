package com.practicecode.arraycode;

import java.util.Set;
import java.util.HashSet;

// Leetcode 217. Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/description/
// https://medium.com/@rohini.godavarthi/leetcode-217-contains-duplicate-e14a78e796a6

public class checkContainDuplicate {

	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> numSet = new HashSet<>();
		for (int i =0; i<nums.length; i++) {
			if (!numSet.contains(nums[i])) {
				numSet.add(nums[i]);
			} else {
				return true;
			}
		}
		return false;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] nums = {1,2,3,1};
		//int [] nums = {1,2,3,4};
		int [] nums = {1,1,1,3,3,4,3,2,4,2};
				
		if (containsDuplicate(nums)) {
			System.out.println("Duplication"); 
		} else {
			System.out.println( "not Duplicate"); 
		}
	}

}
