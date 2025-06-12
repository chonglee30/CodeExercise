package com.practicecode.arraycode;

import java.util.Map;
import java.util.HashMap;

public class GetFrequentItem {

	public GetFrequentItem() {
	}
	
	public int getMostFrequentlyOccurringItem(int [] array) {
		
		int mostCount = -1;
		int mostItem =  -1;
		
		Map <Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for (int i=0; i<array.length; i++) {
			if (!map.containsKey(map.get(array[i]))) {
				map.put(array[i], 1);
			} else {
				map.put(array[i], map.get(array[i])+1);
			}
			
			if (map.get(array[i])>mostCount) {
				mostCount = map.get(array[i]);
				mostItem = array[i];
			}
		}
		return mostItem;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = new int[]{1,3,1,3,2,1};
		
		GetFrequentItem frequentItem = new GetFrequentItem();
		int mostItem = frequentItem.getMostFrequentlyOccurringItem(array);
		System.out.println("Most Frequent Item: "+mostItem);
	}

}
