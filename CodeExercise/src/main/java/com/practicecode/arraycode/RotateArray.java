package com.practicecode.arraycode;

import java.util.Arrays;

public class RotateArray {
	
	public int[] rotateLeft(int [] arr, int rotateNumber) {
		int arrLength = arr.length;
		for (int i=0; i<rotateNumber; i++) {
			int temp = arr[0];
			for (int j=0; j<arrLength-1; j++) {
				arr[j] = arr[j+1];
			}
			arr[arrLength-1] = temp;
		}
		return arr;
	}
	
	public int[] rotateRight(int [] arr, int rotateNumber) {
		int arrLastIndex = arr.length-1;
		for (int i=0; i<rotateNumber; i++) {
			int temp = arr[arrLastIndex];
			for (int j=arrLastIndex; j>0; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		}
		return arr;
	}
	
	public void printRotatedArray() {
		int [] arr = {1,2,3,4,5,6,7,8};	
		int [] arr1 = {1,2,3,4,5,6,7,8};	
		int rotateNumber = 2;
		System.out.println("Left Rotated Array: "+Arrays.toString(rotateLeft(arr, rotateNumber)));	
		System.out.println("Left Rotated Array: "+Arrays.toString(rotateRight(arr1, rotateNumber)));	
	}
	
	
	public static void main(String[] args) {
		RotateArray rotateArray = new RotateArray();
		rotateArray.printRotatedArray();
	}
	
}
