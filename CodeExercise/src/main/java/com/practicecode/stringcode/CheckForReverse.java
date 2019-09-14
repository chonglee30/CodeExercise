package com.practicecode.stringcode;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Stack;

public class CheckForReverse {

	// Reverse String#1:
	public String reverseString(String str) {
		StringBuilder sb = new StringBuilder();
		
		int lastCharIndex = str.length()-1;
		for (int i=lastCharIndex; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
	// Reverse String#2:
	public String reverseStringStack(String str) {
		Stack<Character> stack = new Stack<Character>();
		
		for (int i=0; i<str.length(); i++ ) {
			stack.push(str.charAt(i));
		}
		
		char[] charArray = str.toCharArray();
		int index=0;
		
		while (!stack.isEmpty()) {
			charArray[index] = stack.pop();
			index++;
		}
		
		String reverseStr = new String(charArray);
		return reverseStr;
	}
	
	
	@Test
	public void testReverse() {
		String str = "testing";
		System.out.println(reverseStringStack(str));		
	}
	
}