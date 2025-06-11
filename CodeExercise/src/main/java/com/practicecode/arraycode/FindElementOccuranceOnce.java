package com.practicecode.arraycode;

import java.util.HashMap;
import java.util.Map;

public class FindElementOccuranceOnce {

	public int findNumberOnlyOnce() {
		
		int array[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3};

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (Integer num : array) {
			if (!map.containsKey(num)) {
				map.put(num, 1);
			} else {
				int value = map.get(num);
				value++;
				map.put(num, value);
			}
		}
		
		Integer onceElement =null;
		
		for (Integer key : map.keySet()) {
			Integer value = map.get(key);
			//System.out.println("Key:"+ key + "Value:"+ value);
			
			if (value ==1)  onceElement = key;
		}
				
		return onceElement;
	}
	
	public static void main(String[] args) {
	
		FindElementOccuranceOnce element = new FindElementOccuranceOnce();
		System.out.println(element.findNumberOnlyOnce());
	}
	
}
