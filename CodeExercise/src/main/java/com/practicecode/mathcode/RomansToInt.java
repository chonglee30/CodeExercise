package com.practicecode.mathcode;
import java.util.Map;
import java.util.HashMap;

// Leetcode 13. Roman to Integer
// https://leetcode.com/problems/roman-to-integer/
// Java: https://www.youtube.com/watch?v=AxQtL3ZUC84
// JS: https://medium.com/@margaretH4milton/understanding-leetcode-13-roman-to-integer-9cab084d2bc7

// Try Following:
//Leetcode 12. Integer to Roman
// https://leetcode.com/problems/integer-to-roman/

public class RomansToInt {

	public static int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		char [] charArray = s.toCharArray();
		int sum=0;
		int previousValue=0, currentValue=0;
		
		for (char c: charArray) {
			currentValue = map.get(c); 
			
			if (currentValue>previousValue) {
				currentValue = currentValue - (2*previousValue);
			} 
				
			sum+=currentValue;
			previousValue = currentValue;
		}
    
		System.out.println(sum);
		return sum;
	}
	
	public static void main(String[] args) {
		// Test Scenario1: most of scenarios
		String s1 = "III";
		String s2 = "XII";
		String s3 = "XXVII";
		
		romanToInt(s1);
		romanToInt(s2);
		romanToInt(s3);
		
		// Test Scenario2: current value > previous value
		String s4 = "IV";
		String s5 = "IX";
		String s6 = "XL";
		String s7 = "XC";
		String s8 = "CD";
		String s9 = "CM";
		String s10 = "XXIV";
		
		romanToInt(s4);
		romanToInt(s5);
		romanToInt(s6);
		romanToInt(s7);
		romanToInt(s8);
		romanToInt(s9);
		romanToInt(s10);
	}

}
