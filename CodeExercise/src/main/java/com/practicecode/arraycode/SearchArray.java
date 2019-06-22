package com.practicecode.arraycode;

import java.util.Arrays;

public class SearchArray {

	public void binarySearch(int [] array, int searchNumber) {
		int end = array.length-1;
		int initial =0; 
		int mid=0;
		
		while (initial < end) {
			mid = (initial+end)/2;
			
			if (searchNumber < array[mid]) {
				System.out.println("LESS: Start:"+initial+" Mid:"+mid+" End:"+end);
				end = mid-1;

			} else if (searchNumber> array[mid]) {
				System.out.println("GREATER: Start:"+initial+" Mid:"+mid+" End:"+end);
				initial = mid+1;
			} else if (searchNumber == array[mid]){
				System.out.println("Found: "+searchNumber + " Index At: "+mid);
				break;
			}
			
		}	
	}

	public static void main(String[] args) {
		int []arr = {5,12,17,23,38,44,77,84,90};
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
		System.out.println();
		SearchArray searchArr = new SearchArray();
		searchArr.binarySearch(arr, 17);	
	}

}