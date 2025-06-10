package com.practicecode.arraycode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

//Leetcode 1403. Minimum Subsequence in Non-Increasing Order
//https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/
//Priority Queue
//https://www.youtube.com/watch?v=FD85_H83ocA
//https://www.youtube.com/watch?v=t6uGKpiXDFw
	
public class MinSubsequenceOrder {
	// My Initial Solution:
	/*
	 public static List<Integer> minSubsequence(int[] nums) {	     
		 int subSum=0;
		 int remainingSum=0;
		 PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		 int index =1;
		 
		 Arrays.sort(nums);
		 for (int num : nums) {
			 pQueue.add(num);
		 }
		 
		 Iterator<Integer> iterator = pQueue.iterator();
		 while (iterator.hasNext()) {
			 for (int i=index; i<nums.length; i++) {
				 remainingSum += nums[i];
			 }
			 if ((subSum + pQueue.peek()) >= remainingSum) { 
				 break;
			 } else {
				 subSum+=pQueue.poll();
				 //System.out.println("Sub Sum:"+subSum);
			 }		 		 
			 index++;
			 remainingSum=0;
		 }
		 
		 List<Integer> list = new ArrayList<>(pQueue); 
//		 while (pQueue.size()>0) {
//			 list.add(pQueue.poll());
//		 }		 
		 //Collections.sort(list, Collections.reverseOrder());	
		 Collections.sort(list, (a,b) -> b-a);
		 
		 System.out.println(Arrays.toString(list.toArray()));
		 return list;
	 } */
	
	 // After Youtube Hint:
	 public static List<Integer> minSubsequence(int[] nums) {	
		 PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		 for (int num : nums) {
			 pQueue.add(num);
		 }
		 
		 int sum = Arrays.stream(nums).sum();  // Sum of Array
		 int remove =0;
		 
		 while(sum > remove && !pQueue.isEmpty()) {
			 int currentValue = pQueue.peek(); 
			 System.out.println("Current Value:"+ currentValue);
			 if((sum-currentValue) > (remove+currentValue)) {
				 remove+=currentValue;
				 sum-=currentValue;
				 System.out.println("remove:"+ remove);
				 System.out.println("sum:"+ sum);
				 pQueue.poll();
			 } else {
				 break;
			 }
		 }
		 List<Integer> list = new ArrayList<>(pQueue); 
		 Collections.sort(list, (a,b) -> b-a);
		 System.out.println(Arrays.toString(list.toArray()));
		 return list;
	 }
	
	public static void main(String[] args) {
		int []nums1 = {4,3,10,9,8};
		minSubsequence(nums1);
		
		int [] nums2 = {4,4,7,6,7};
		minSubsequence(nums2);
	}

}
