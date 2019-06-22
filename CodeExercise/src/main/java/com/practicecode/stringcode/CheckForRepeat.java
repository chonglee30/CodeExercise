package com.practicecode.stringcode;

import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.Map;
import java.util.LinkedHashMap;

public class CheckForRepeat {
	
	// Solution#1: Classic: Force
	public Character getFirstNonRepeatedCharacterClassic(String str) {
		char firstNonRepeated = '\0';
		boolean repeated=true;
	
		for (int i=0; i<str.length(); i++) {
			for (int j=i+1; j<str.length(); j++) {
				if (str.charAt(i)== str.charAt(j)) {
					repeated = true;
					break;
				} else {
					repeated = false;
				}
			}
			if (!repeated) {
				firstNonRepeated = str.charAt(i);
				return firstNonRepeated;
			}
		}
		return firstNonRepeated;
	} 
	
	// Util Function (HashMap): for Solution#2
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
	
	// Solution#2: LinkedHashMap
	public Character getFirstNonRepeatedCharacterByLinkedHashMap(String str) {
		Map<Character,Integer> linkedHashMap = buildLinkedHashMap(str);
		Character nonRepeatedChar='\u0000';

		for (Map.Entry<Character, Integer> entry : linkedHashMap.entrySet()) {
			if (entry.getValue() ==1) {
				nonRepeatedChar= entry.getKey();
				return nonRepeatedChar;
			}
		}
		return nonRepeatedChar;
	}

	@Test
	public void nonRepeatedClassicTest() {
		String str="abraham";
		System.out.println("First Non-Repeated Character of "+str+":"+getFirstNonRepeatedCharacterClassic(str));
	}
	
	@Test
	public void nonRepeatedHashTest() {
		String str="abraham";
		System.out.println("First Non-Repeated Character: "+getFirstNonRepeatedCharacterByLinkedHashMap(str));
	}
	
}
