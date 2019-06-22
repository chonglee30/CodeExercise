package com.practicecode.stringcode;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckForSubstring {
	
	// Util Function:
	// 1. Build Linked HashMap: Char, Number of Repeated 
	private Map<Character,Integer> buildLinkedHashMap(String str) {
		Map<Character,Integer> linkedMap = new LinkedHashMap<>(str.length());
		int occurrence =1;
		
		for (int i=0; i<str.length(); i++) {
			if (!linkedMap.containsKey(str.charAt(i))) {
				linkedMap.put(str.charAt(i), occurrence);
			} else {
				int times = linkedMap.get(str.charAt(i));
				times++;
				linkedMap.put(str.charAt(i), times);
			}
		}
		return linkedMap;
	}

	// Calling Function:
	// 1. Build Linked HashMap - Character, Integer
	// 2. For Loop each character in String
	public int longestSubStringNoRepeatChar(String str) {
		
		Map<Character,Integer> map = buildLinkedHashMap(str); 
		int numberLongestSubstring =0;
		int currentLongestSubstring=0;
		
		for (int i=0; i<str.length(); i++) {
			Integer occuValue = map.get(str.charAt(i));
		
			if (occuValue==1) {
				currentLongestSubstring++;
			} else {
				currentLongestSubstring=0;
			}
			
			if (currentLongestSubstring>numberLongestSubstring) {
				numberLongestSubstring = currentLongestSubstring;
			}
		}
		return numberLongestSubstring;
	}
	
	@Test
	public void longestSubStringWithNoRepeat() {
		String str="programming";
		System.out.println("Longest SubString Number:"+ longestSubStringNoRepeatChar(str));
	}
}