package com.practicecode.arraycode;

import java.util.Map;
import java.util.TreeMap;

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
	
	
	
	
	public static void main(String[] args) {
		Integer num []= {2, 13, 12, 9, 10, 17,6};
		//getSecondNumberUsingMap(num);
		getSeondLargestNum(num);
	}
}
