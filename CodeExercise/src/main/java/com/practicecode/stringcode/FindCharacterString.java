package com.practicecode.stringcode;

import java.util.Map;
import java.util.LinkedHashMap;

public class FindCharacterString {

// Leetcode 387. First Unique Character in a String
//https://leetcode.com/problems/first-unique-character-in-a-string/submissions/1621470834/
		
	public static int firstUniqChar(String s) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		char [] charArray = s.toCharArray();
		int times =1;
		char firstChar='\0';
		
		for (char c : charArray) {
			if (map.containsKey(c)) {
				times = map.get(c);
				times++;
			} else {
				times =1;
			}
			//System.out.println(c);
			//System.out.println(times);
			map.put(c, times);
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				firstChar = entry.getKey();
				//System.out.println("1st:"+firstChar);
				break;
			}
		}
		return s.indexOf(firstChar);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "leetcode";
		System.out.println(firstUniqChar(s1));
		
		String s2 = "loveleetcode";
		System.out.println(firstUniqChar(s2));	
		
		String s3 = "aabb";
		System.out.println(firstUniqChar(s3));
		
		String s4 = "bd";
		System.out.println(firstUniqChar(s4));
		
		String s5 = "dddccdbba";
		System.out.println(firstUniqChar(s5));	
	}
}
