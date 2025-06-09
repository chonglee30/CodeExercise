package com.practicecode.arraycode;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// LeetCode 349. Intersection of Two Arrays
// https://leetcode.com/problems/intersection-of-two-arrays/description/
// Better Solution:
// https://www.youtube.com/watch?v=w5mBjxL1pok
// https://medium.com/@niazsagor/leetcode-349-intersection-of-two-arrays-ae7ada6192d9
public class IntersectionTwoArrays {

	// My Initial Solution:
	public static int[] myIntersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		List<Integer> intersectList = new ArrayList<>();
		
		for (int num : nums1) {
			set1.add(num);
		}
		
		for (int num : nums2) {
			set2.add(num);
		}
		
		List<Integer> list2 = new ArrayList<>(set2);
		Collections.sort(list2);
				
		Integer[] array2 = list2.toArray(new Integer[0]);
		
		System.out.println(set1);
		System.out.println(set2);
		
		for (Integer value : set1) {
			if (searchFound(value, array2)) {
				intersectList.add(value);
			}
		}
		
		Integer [] arrayList = intersectList.toArray(new Integer[0]);
		
		int [] intersectArray = new int[arrayList.length];
		
		for (int i =0; i< arrayList.length; i++) {
			intersectArray[i] = arrayList[i].intValue();
		}
		return intersectArray;
    }
	
	public static int[] intersection(int[] nums1, int[] nums2) {
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> intersectSet = new HashSet<>();
		
		for (int num : nums1) {
			set1.add(num);
		}
		
		for (int num : nums2) {
			if (set1.contains(num)) {
				intersectSet.add(num);
			}
		}
		
		int [] intersectArray = new int[intersectSet.size()];
		int index =0; 
		
		for (Integer i : intersectSet) {
			intersectArray[index++] = i;
		}
		return intersectArray;
	}
	
	private static boolean searchFound(int searchTarget, Integer [] array) {
		boolean found = false;
		
		int low = 0;
		int high = array.length-1;
		int mid;
		
		while (low <= high) {
			mid = (low+high)/2;
			if (array[mid] == searchTarget) {
				found = true;
				break;
			} else if (array[mid] > searchTarget) {
				high = mid -1;
			} else if (array[mid] < searchTarget) {
				low= mid +1;
			}
		}
		return found;
	}
	
	public static void main(String[] args) {
		// Example1:
		// Input: nums1 = [1,2,2,1], nums2 = [2,2]
		// Output: [2]

		// Example2:
		// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
		// Output: [9,4]
		
		// Example1:
		//int [] nums1 = {1,2,2,1};
		//int [] nums2 = {2,2};
		
		// Example2:
		int [] nums1 = {4,9,5};
		int [] nums2 = {9,4,9,8,4};
		
		int [] intersectArray = intersection(nums1, nums2);
		for (int i =0; i<intersectArray.length; i++) {
			System.out.println(intersectArray[i]);
		}
	}
}
