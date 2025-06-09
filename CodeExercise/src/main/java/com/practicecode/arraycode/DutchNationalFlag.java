package com.practicecode.arraycode;

import java.util.Arrays;

// 75. Sort Colors - Dutch National Flag Medium
// https://leetcode.com/problems/sort-colors/description/
// https://www.youtube.com/watch?v=6sMssUHgaBs&pp=ygUOI3NvcnR0aGVjb2xvcnM%3D => Try Swap
// https://www.youtube.com/watch?v=AUAY3dTp3hY
// https://www.youtube.com/watch?v=LVg_wN4lQhs

//Dutch National Flag Problem
//https://www.youtube.com/watch?v=6sMssUHgaBs
	
public class DutchNationalFlag {

	public int[] sortAdjacentColor(int [] array)  {
		
		int start =0;
		int end = array.length -1;
		int index =0;
		int temp = -1;
		
		while (index <= end) {
			if (array[index] == 0) {
				// Swap:
				temp = array[index];
				array[index] = array[start];
				array[start] = temp;	
				index++;
				start++;
			} else if (array[index] == 2) {
				// Swap:
				temp = array[index];
				array[index] = array[end];
				array[end] = temp;	
				end--;
			} else if (array[index] == 1) {
				index++;
			}
			System.out.println(index);
		}

		return array;
	}
	
	public int[] sortAdjacentExtraArray(int [] array)  {
		
		int index =0;
		int start =0;
		int end = array.length -1;
		int [] sortedArray = new int [array.length];
		
		while (index <= (array.length -1)) {
			if (array[index] ==0) {
				sortedArray[start] = 0;
				start ++;
			} else if (array[index] ==2) {
				sortedArray[end] = 2;
				end --;
			} 
			index++;
		}
		
		while (start <= end) {
			sortedArray[start] = 1;
			start++;
		}
		return sortedArray;
	}
	
	// Try Swap and without creating new array
	// https://www.youtube.com/watch?v=6sMssUHgaBs&pp=ygUOI3NvcnR0aGVjb2xvcnM%3D
	
	public static void sortColors(int[] nums) {
        
		int start =0;
		int end = nums.length-1;
		int current =0;
		int temp;
		
		while (current <=end) {
			if (nums[current] ==0) {
				// Swap:
				temp = nums[current];
				nums[current] = nums[start];
				nums[start] = temp;
				start++;
				current++;
				
			} else if (nums[current] ==1) {
				current++;
			} else if (nums[current] ==2) {
				// Swap:
				temp = nums[current];
				nums[current] = nums[end];
				nums[end] = temp;
				end--;
			}
		}
		
		System.out.println(Arrays.toString(nums));
    }
	
	public static void main(String[] args) {
		
		int [] array = {2,0,2, 1,1,0};
		DutchNationalFlag dutchFlag = new DutchNationalFlag();
		//System.out.println(dutchFlag.sortAdjacentColor(array));
		//System.out.println(Arrays.toString(dutchFlag.sortAdjacentExtraArray(array)));
		
		int [][] inputs = {{2, 0, 2, 1, 1, 0}, {2, 0, 1}, {2, 0, 2, 1, 1, 0, 1, 0, 1, 0, 2}};
		
		/*
		for (int input[] : inputs) {
			System.out.println(Arrays.toString(dutchFlag.sortAdjacentColor(input)));
		} */
		
		int [] nums1= {2,0,2,1,1,0};
		sortColors(nums1);
		
		int [] nums2 = {2,0,1};
		sortColors(nums2);
	}

}
