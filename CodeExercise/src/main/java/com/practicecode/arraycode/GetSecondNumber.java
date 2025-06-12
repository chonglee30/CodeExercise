package com.practicecode.arraycode;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.PriorityQueue;

public class GetSecondNumber {

	private static void getSecondNumberUsingMap(Number [] array) {
		
		Map<Integer,Number> map = new TreeMap<Integer,Number>();
		
		for (int i=0; i<array.length; i++) {
			map.put(i, array[i]);
		}
		
		System.out.println("Second Element using Map: "+map.get(1));
	}
	
	private static void getSeondLargestNum(Integer[] array) {
		int first = array[0];
		int second =0;
		for (int i=1; i<array.length; i++) {
			if (array[i]>first) {
				second = first;
				first = array[i];
			}
			
			if ((array[i]> second) && (array[i]<first)) {
				second = array[i];
			}
		}
		
		System.out.println("First Largest Value: "+first);
		System.out.println("Second Largest Value: "+second);
	} 
	
	public static int getSecondLargest(int[] num1) {
		int first = num1[0];
		int second = -1;
		
		for (int i=1; i< num1.length; i++) {
			if (num1[i] > first) {
				second = first;
				first = num1[i];
			}
			
			if (num1[i] > second && num1[i] < first) {
				second = num1[i];
			}
		}
		return second;
	}
	
	public static void largestNum(Integer[] array) {	
		int small, large;
		
		small = array[0];
		large = array[0];
		
		for (int i=0; i< array.length; i++) {
			if (array[i]>large) {
				large = array[i];
			} else if (array[i] < small) {
				small = array[i];
			}
		}
		
		System.out.println("Smallest: "+small);
		System.out.println("Largest: "+large);
	}
	
	public static void secondNumber(Integer[] array) {
		int first = array[0];
		int second = 0;
		
		for (int i=0; i<array.length; i++) {
			if (array[i]> first) {
				second = first;
				first = array[i];
			}
		}
		
		System.out.println("First Number: "+first);
		System.out.println("Second Number: "+second);
	}
	
	// Leetcode# 1796. Second Largest Digit in a String
	// https://leetcode.com/problems/second-largest-digit-in-a-string/description/
	// References:
	// https://www.youtube.com/watch?v=3C0Zfj6kQKg
	// https://www.youtube.com/watch?v=hyQUsjKrq1s
	// https://www.youtube.com/watch?v=1ZM9Bpcumkk

	// Java Code References:
	// https://www.baeldung.com/java-string-number-presence
	// https://www.geeksforgeeks.org/character-isdigit-method-in-java-with-examples/
	/*public static int secondHighest(String s) {
	   List<Integer> list = new ArrayList<>();
	   int numbers =0;
	   Map<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			map.put(c, numbers);
		}
		
		Set<Character> set = map.keySet();
		
		for (char c : set) {
			if (Character.isDigit(c)) {
				int num = c - '0';
		        list.add(num);
			}
		}
		
		Integer[] arr = new Integer[list.size()];
		 for (int i = 0; i < list.size(); i++)
	            arr[i] = list.get(i);
	     
		int largest;
		int second=-1;
		
		//System.out.println(arr.length);
		if (arr.length == 1 || arr.length == 0) return -1;
		
		largest = arr[0];
		for (int i=1; i< arr.length; i++) {
			if (arr[i] > largest) {
				second = largest;
				largest = arr[i];
			} else {  // arr[i] < largest
				if (arr[i] > second) second = arr[i];
			}
		}
		
		//System.out.println(second);
		return second; 
	} */
	
	// After Watching Youtube Hint: better optimized solution
	// https://www.youtube.com/watch?v=1ZM9Bpcumkk
	// Priority Example: https://www.geeksforgeeks.org/priority-queue-of-pair-in-java-with-examples/
	public static int secondHighest(String s) {
		Set<Integer> set = new HashSet<>();
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>((a,b) -> b-a);
		
		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
				int d = c - '0';
				if (! set.contains(d)) {
					set.add(d);
					pQueue.add(d);
				}
			}
		}
		
		if (set.size() <2) return -1;
		
		pQueue.poll();
		return pQueue.poll();		
	}
	
	public static void main(String[] args) {
		Integer num []= {2, 13, 12, 9, 10, 17,6};
		//getSecondNumberUsingMap(num);
		//getSeondLargestNum(num);
		//secondNumber(num);
		//largestNum(num);
		
		int num1 []= {1, 3, 4, 5, 0, 2, 11, 9};
		//System.out.println(getSecondLargest(num1));
		
		String s1 = "dfa12321afd";
		System.out.println(secondHighest(s1));
		
		String s2 = "abc1111";
		System.out.println(secondHighest(s2));
		
		String s3 = "xyz";
		System.out.println(secondHighest(s3));
		
	}
}
