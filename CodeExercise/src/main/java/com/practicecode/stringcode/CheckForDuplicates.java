package com.practicecode.stringcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class CheckForDuplicates {
		
	// Util - Problem#4: Find the duplicate characters from String
	public int findMostOccurredNumberChar(Map<Character, Integer> map, String str) {
			int maxOccurredNum =0;
			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
				if (entry.getValue() >maxOccurredNum) {
					maxOccurredNum = entry.getValue();
				}
			}
			return maxOccurredNum;
	}

	// Util - Problem #4	
	public Set<Character> findMostOccurredChars(String str) {
			int mostOccurredCharNum=0;
			Map<Character, Integer> map = buildMap(str);
			Set<Character> mostCharSet = new HashSet<>();
			mostOccurredCharNum = findMostOccurredNumberChar(map, str);
			System.out.println("Most Occurred Char Num: "+mostOccurredCharNum);
			for (Map.Entry<Character, Integer> entry: map.entrySet()) {
				if (entry.getValue()== mostOccurredCharNum) {
					mostCharSet.add(entry.getKey());
					System.out.println("Most Occurred Key: "+entry.getKey()+ "Value: "+entry.getValue());
				}
			}
			return mostCharSet;
	 }
	
	// Problem#4 - Print	
	public void printMostOccurredChars(String str) {
		Set<Character> mostOccurredSet = findMostOccurredChars(str);
		
		System.out.print("Most Occurred Characters: ");
		for (Character ch : mostOccurredSet) {
			System.out.print(ch);
			System.out.print(" ");
		}
		System.out.println();
	}	
	
	// Problem#3: Remove a given character from String
	public String removeGivenChar(String str, char givenChar) {
		StringBuilder sb = new StringBuilder(str);
		int numRemovedIndex=0;
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)==givenChar) {
				sb.deleteCharAt(i-numRemovedIndex);
				numRemovedIndex++;
			}
		}
		return sb.toString();
	}
	
	// Util - Problem#2, 4: Build Map:
	private Map<Character,Integer> buildMap(String str) {
		Map<Character,Integer> map = new HashMap<>();
		int firstTime =1;
		
		for (int i=0; i<str.length(); i++) {
			char keyChar = str.charAt(i);
			
			if (!map.containsKey(str.charAt(i))) {
				map.put(keyChar, firstTime);
			} else {	// key contains in the hashmap
				Integer times = (Integer)map.get(keyChar);
				times++;
				map.put(keyChar, times);
			}
		}
		return map;
	} 
	
	// Util - Problem#2: Find Duplicate Characters:
	public Set<Character> findDuplicateChar(String str) {
		Set<Character> set = new HashSet<Character>();
		Map<Character, Integer> map = buildMap(str);
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() >1) {
				System.out.println("Following Character "+entry.getKey()+" has "+entry.getValue()+" duplicate values!");
				set.add(entry.getKey());
			}
		}
		return set;	
	}
	
	// Problem#2: Remove the duplicate characters from String
	public String removeDuplicateChar(String str) {
		Set<Character> duplicateSet = findDuplicateChar(str);
		StringBuilder sb = new StringBuilder(str);
		
		char[] charArray = str.toCharArray();
		
		for (char c: charArray) {
			for (Character ch : duplicateSet) {
				if (c==ch) {
				int index = sb.indexOf(""+ch);
				System.out.println("Remove Characters: "+ch+"at Index:"+index);
				sb.deleteCharAt(index);
				}
			}
		}
		return sb.toString();
	}

	// Util - Problem#1: Print Duplicate Characters:
	public void printDuplicateCharacters(String str) {	
		Map<Character, Integer> map = buildMap(str);
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() >1) {
				System.out.println("Following Character "+entry.getKey()+" has "+entry.getValue()+" duplicate values!");
			}
		}
	}
	
	// Util - Problem#1: Find the occurrence of a given character in a string
	public Integer findOccurrenceChar(String str, char givenChar) {
		Map<Character, Integer> map = buildMap(str);
		for (Map.Entry<Character, Integer> entry: map.entrySet()) {
			if (entry.getKey()== givenChar) {
				return entry.getValue();
			}
		}
		return -1;
	}

	// Problem#1: Count the occurrence of a given character in a string
	public void countOccurrenceInfo(String str, char givenChar) {
		int times = findOccurrenceChar(str, givenChar);
		if (times == -1) {
			System.out.println("Never Occurred!");
		} else {
			System.out.println("Number of occurrence of "+givenChar+": "+findOccurrenceChar(str, givenChar));
		}
	}
	
	// Problem#1:
	@Test(groups="Easy")
	public void testDuplicates() {
		String str = "programming";
		char occurrence ='m';
		countOccurrenceInfo(str, occurrence);	
		printDuplicateCharacters(str);
	}
	
	// Problem#2:
	@Test(groups="Easy")
	public void testRemoveDuplicates() {
		String str = "programming";
		String removedStr = removeDuplicateChar(str);
		System.out.println("Removed Duplicate Character: "+removedStr);
	}
	
	// Problem#3:
	@Test
	public void testRemoveGivenChar() {
		String str = "programmingrange";
		String removedStr = removeGivenChar(str, 'g');
		System.out.println("Removed String: "+removedStr);
	}
	
	// Problem#4:
	@Test
	public void testMostOccurredChars() {
		String str = "programmingrange";
		printMostOccurredChars(str);
	}
	
}
