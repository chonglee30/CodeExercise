package com.practicecode.stringcode;

import java.util.Map;
import java.util.Map.Entry;
import java.util.LinkedHashMap;

// LeetCode 387 - First Unique Character in a String
// https://leetcode.com/problems/first-unique-character-in-a-string/description/

// Java Concepts:
// LinkedHashMap
// Map.Entry<Character, Integer> mapEntry : map.entrySet()
// mapEntry.getKey()
// mapEntry.getValue() 

public class NonRepeatedChar {
	
	public Character printFirstNonRepeatedChar(String sentence) {
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		int count = -1;
		Character key = null;
		
		for (int i=0; i< sentence.length(); i++ ) {
			key = sentence.charAt(i);
			if ( map.containsKey(key)) {
				count = map.get(key);
				count++;
				map.put(key, count);
			} else {
				count++;
				map.put(key, count);
			}
			count=0;
		}
		
		for (Map.Entry<Character, Integer> mapEntry : map.entrySet()) {
			if (mapEntry.getValue() == 1) {
				return mapEntry.getKey();
			}
		}
		return null;	
	}
	
	public static void main(String[] args) {
		NonRepeatedChar nonRepatedChar = new NonRepeatedChar();
		System.out.println(nonRepatedChar.printFirstNonRepeatedChar("texteut") ) ;
	}

}
