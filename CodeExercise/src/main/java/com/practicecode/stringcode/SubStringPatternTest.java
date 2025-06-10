package com.practicecode.stringcode;

// LeetCode 459. Repeated Substring Pattern
// https://leetcode.com/problems/repeated-substring-pattern/description/
//References:
//https://www.youtube.com/watch?v=bClIZj66dVE
//https://www.youtube.com/watch?v=bClIZj66dVE
public class SubStringPatternTest {
	 /* 
	  * My Original Solution: incorrect when I tried ababab
	 public static boolean repeatedSubstringPattern(String s) {
	        if ((s.length()%2) !=0) {  // Odd Number
	        	return false;
	        } else {	// Even Number	
	        	int endIndex = s.length();
	        	int midIndex = s.length()/2;
	        	String firstHalf = s.substring(0, midIndex);
	        	String secondHalf = s.substring(midIndex, endIndex);
	        	System.out.println(firstHalf);
	        	System.out.println(secondHalf);
	        	
	          	boolean status = (firstHalf.equals(secondHalf)) ?  true : false;
	        	return status;
	        }
	 }*/
	
	// After Watching Youtube Hint
	public static boolean repeatedSubstringPattern(String s) {
		int strLength = s.length();
		
		for (int i=strLength/2; i>0; i--) {
			if (strLength%2 ==0) {
				String subString = s.substring(0, i);
				int numRepeats = strLength/i;
				StringBuilder sb = new StringBuilder();
				for (int j=0; j<numRepeats; j++) {
					sb.append(subString);
				}
				
			if (sb.toString().equals(s)) return true;	
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		String s1 = "abab";
		System.out.println(repeatedSubstringPattern(s1));
		
		String s2 = "aba";
		System.out.println(repeatedSubstringPattern(s2));
		
		String s3 = "abcabcabcabc";
		System.out.println(repeatedSubstringPattern(s3));
		
		String s4 = "ababab";
		System.out.println(repeatedSubstringPattern(s4));
	}

}
