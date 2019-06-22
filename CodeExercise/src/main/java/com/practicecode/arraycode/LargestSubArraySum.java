package com.practicecode.arraycode;

public class LargestSubArraySum {
	public int getLargestSubArraySum(int []arr) {
		int currentMax =0;
		int globalMax =0;
		
		for (int i=0; i<arr.length; i++) {
			currentMax = Math.max(arr[i], currentMax+arr[i]);
			if (currentMax > globalMax) {
				globalMax=currentMax;
			}
		}
		return globalMax;
	}
	
	public static void main(String[] args) {
		LargestSubArraySum subArraySum = new LargestSubArraySum(); 
		int [] array = {1,-2,3,4,-5,8};
		System.out.println("Largest Sub-Array:"+subArraySum.getLargestSubArraySum(array));
	}
}
