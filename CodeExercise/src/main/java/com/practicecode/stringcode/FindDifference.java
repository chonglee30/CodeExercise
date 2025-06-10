package com.practicecode.stringcode;

public class FindDifference {

	// Leetcode #389. Find the Difference
	// https://leetcode.com/problems/find-the-difference/description/
	public static char findTheDifference(String s, String t) {
		char [] charArray = s.toCharArray();
		int index =0;
		StringBuilder sb = new StringBuilder(t);
		
		for (char c : charArray) {
			index = sb.indexOf(c+"");
			sb.deleteCharAt(index);
		}
		return sb.charAt(0);
    }
	
	public static void main(String[] args) {
		String s1 = "abcd"; 
		String t1 = "abcde";
		System.out.println(findTheDifference(s1, t1)); 
		
		String s2 = ""; 
		String t2 = "y";
		System.out.println(findTheDifference(s2, t2));
	}
}
