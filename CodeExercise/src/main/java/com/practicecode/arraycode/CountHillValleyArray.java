package com.practicecode.arraycode;

public class CountHillValleyArray {

	//Leetcode 2210. Count Hills and Valleys in an Array
	//https://leetcode.com/problems/count-hills-and-valleys-in-an-array/
	//https://www.youtube.com/watch?v=DutqdrKO9Q0

	//https://dev.to/marcelos/2210-count-hills-and-valleys-in-an-array-3j07
	//https://www.youtube.com/watch?v=I9ZXvpleMDk
	//https://www.youtube.com/watch?v=XG_DSLGjO4o

	// My Initial Solution: complicated
	/*
	public static int countHillValley(int[] nums) {	
		int firstIndex =0;
		int lastIndex = nums.length -1;
		int prev =0, next =0;
		boolean done = true;
		int numHills=0, numValley=0;
		
		for (int i=1; i< nums.length-1; i++) {
			prev = i-1;
			next = i+1;
			done = true;
			
			while (done && (prev >=firstIndex || next <= lastIndex)) {
				if ((nums[i] > nums[prev]) && nums[i]>nums[next]) {
					numHills++;
					done = false;
				} else if ((nums[i] < nums[prev]) && nums[i] < nums[next]) {
					numValley++;
					System.out.println("Valley:"+i);
					done = false;
				}
				
				if (nums[i] == nums[prev]) {
					// don't count
					prev--;
					break;
				} else if (nums[i] == nums[next] && next != lastIndex) {
					next++;
					System.out.println("index:"+i);
					System.out.println("next:"+next);
				} else {
				System.out.println("index: bottom"+i);
				done = false;
				}
			}
		}	
		System.out.println("Num Hills: "+numHills);
		System.out.println("Num Valleys: "+numValley);
		System.out.println("Combined: "+(numHills+numValley) );
		return (numHills+numValley);
	} */

	// Using Two Pointer Technique: simple and efficient solution
	/*public static int countHillValley(int[] nums) {	
		int leftValue = nums[0];
		int numHills=0, numValley=0;
		
		for (int i=1; i< nums.length-1; i++) {
			System.out.println("index to test: "+i);
			if ((nums[i] > leftValue) && nums[i]>nums[i+1]) {
				System.out.println("if nums value: "+nums[i]);
				System.out.println("index: "+i);
				System.out.println("nums left value: "+leftValue);
				System.out.println("nums Next value: "+nums[i+1]);
				numHills++;
				leftValue = nums[i];
			} else if ((nums[i] < leftValue) && nums[i] < nums[i+1]) {
				System.out.println("else if nums value: "+nums[i]);
				System.out.println("index: "+i);
				System.out.println("nums left value: "+leftValue);
				System.out.println("nums Next value: "+nums[i+1]);
				numValley++;
				leftValue = nums[i];
			}	
		}
		
		return (numHills+numValley);
	} */
	
	public static int countHillValley(int[] nums) {	
		int prev = nums[0];
		int numHills=0, numValley=0;
		
		for (int i=1; i< nums.length-1; i++) {
			int current = nums[i];
			int next = nums[i+1];
			
			if (current!= next) {
				if (current> prev && current>next) numHills++;
				else if (current<prev && current<next) numValley++;
				prev = current;
			}
		}
		return (numHills+numValley);
	}
	
	public static void main(String[] args) {
		int []nums1 = {2,4,1,1,6,5};
		System.out.println(countHillValley(nums1));
		
		int [] nums2 = {6,6,5,5,4,1};
		System.out.println(countHillValley(nums2));
		
		int [] nums3 = {57,57,57,57,57,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,85,85,85,86,86,86};
		System.out.println(countHillValley(nums3));		
		
		int [] nums4 = {1,2,2,2,8};
		System.out.println(countHillValley(nums4));
	}

}
