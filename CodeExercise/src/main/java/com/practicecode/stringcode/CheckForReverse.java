package com.practicecode.stringcode;

public class CheckForReverse {

	// Reverse String:
	public String reverseString(String str) {
		StringBuilder sb = new StringBuilder();
		
		int lastCharIndex = str.length()-1;
		for (int i=lastCharIndex; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
}
