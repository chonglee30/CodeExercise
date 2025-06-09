package com.practicecode.arraycode;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

// 2956. Find Common Elements Between Two Arrays
// https://leetcode.com/problems/find-common-elements-between-two-arrays/description/
// Using HashSet:
// https://www.youtube.com/watch?v=o8fJn9nAPzM

public class FindCommonElements {
	public FindCommonElements() {
	}
	
	public List<Integer> getCommonElements(int arrA[], int arrB[]) {
	
		int indexA=0, indexB=0;
		List<Integer> commonList = new ArrayList<Integer>();
		
		while ((indexA<arrA.length) && (indexB<arrB.length)) {
			if (arrA[indexA] == arrB[indexB]) {
				commonList.add(arrA[indexA]);
				indexA++;
				indexB++;
			} else if (arrA[indexA] > arrB[indexB]) {
				indexB++;
			} else if (arrA[indexA]< arrB[indexB]) {
				indexA++;
			}
		}
		return commonList;
	}
	
	// 1. Using Hash
	public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer>set1 = new HashSet<>();
        Set<Integer>set2 = new HashSet<>();
        
        //int answer1=0, answer2 =0;
        int [] intersection = new int[2];
        
        for (int num : nums1) {
        	set1.add(num);
        }
        
        for (int num : nums2) {
        	set2.add(num);
        }
        
        // Longer Codes - Easier to understand code logics
        /*
        for (int num : nums1) {
        	if (set2.contains(num)) answer1++;
        }
        
        for (int num : nums2) {
        	if (set1.contains(num)) answer2++;
        }
        
        intersection[0] = answer1;
        intersection[1] = answer2;
        */
        
        // Short Code Version:
        for (int num : nums1) {
        	intersection[0] += set2.contains(num) ? 1:0;
        }
        
        for (int num : nums2) {
        	intersection[1] += set1.contains(num) ? 1:0;
        }
        
        return intersection;
    }
	
	
	public static void main(String[] args) {
		
		FindCommonElements commonElements = new FindCommonElements();
		int [] arrayA = {1,3,4,6,7,9};
		int [] arrayB = {1,2,4,5,9,10};
		
		List<Integer> commonList =  commonElements.getCommonElements(arrayA, arrayB);
		for (int i=0; i<commonList.size(); i++) {
			System.out.print(commonList.get(i));
			System.out.print(" ");
		}
		
		int [] nums1 = {2,3,2}; 
		int [] nums2 = {1,2};
		System.out.println(Arrays.toString(findIntersectionValues(nums1, nums2)));


		int [] nums3 = {4,3,2,3,1};
		int [] nums4 = {2,2,5,2,3,6};
		System.out.println(Arrays.toString(findIntersectionValues(nums3, nums4)));

		int [] nums5 = {3,4,2,3};
		int [] nums6 = {1,5};
		System.out.println(Arrays.toString(findIntersectionValues(nums5, nums6)));

	}

}
