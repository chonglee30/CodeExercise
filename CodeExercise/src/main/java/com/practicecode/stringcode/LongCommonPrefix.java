package com.practicecode.stringcode;

// LongestCommonPrefix
// Leetcode 14. Longest Common Prefix
// https://leetcode.com/problems/longest-common-prefix/
// https://www.youtube.com/watch?v=bl8ue-dTxgs
//JS: https://duncan-mcardle.medium.com/leetcode-problem-14-longest-common-prefix-javascript-3bc6a2f777c4
//Longest Prefix with animation
//https://www.youtube.com/watch?v=wtOQaovlvhY
//Python: https://www.youtube.com/shorts/5YSqKljnHdQ
//https://www.youtube.com/watch?v=wtOQaovlvhY&t=1s

public class LongCommonPrefix {	
	
	/*
	public static String longestCommonPrefix(String[] strs) {
		
		String prefixStr = strs[0];
		
		for (int i=1; i< strs.length; i++) {
			while (strs[i].indexOf(prefixStr) == -1) {
				prefixStr = prefixStr.substring(0, prefixStr.length()-1);
			}
		}
		System.out.println(prefixStr);
		return prefixStr;
	}*/
	
	/*public static String longestCommonPrefix(String[] strs) {
		String prefixStr = strs[0];
		for (int i=1; i<strs.length; i++) {
			while (strs[i].indexOf(prefixStr) !=0) {
				prefixStr = prefixStr.substring(0, prefixStr.length()-1);
			}
		}
		return prefixStr;
	}*/
	
	public static String longestCommonPrefix(String[] strs) {
    
		String prefix = strs[0];
		System.out.println("Before: Prefix1: "+strs[1].indexOf(prefix));
		System.out.println("Before: Prefix2: "+strs[2].indexOf(prefix));
		
		for (int i=1; i< strs.length; i++) {
			System.out.println("Test String: "+strs[i] +" with this index:"+strs[i].indexOf(prefix));
			//System.out.println("Other Way: "+prefix.indexOf(strs[i]));
			
			while(strs[i].indexOf(prefix) !=0) {
				System.out.println("Prefix: inside while: "+ prefix);
				prefix = prefix.substring(0, prefix.length()-1);
				System.out.println(strs[i]+" : string index with "+prefix+" :"+strs[i].indexOf(prefix));
			}
		}
		
		System.out.println("After Prefix1: "+strs[1].indexOf(prefix));
		System.out.println("After Prefix2: "+strs[2].indexOf(prefix));
		
		//System.out.println("Other Way1: "+prefix.indexOf(strs[2]));
		return prefix;
    }
	
	public static void check() {
		String str1 = "flower";
		String str2 = "flow";
		String emptyPrefix = "";
		
		//String str1 = "sadbutsad";
		//String str1 = "timesadbutsad";
		//String str2 = "sad";
		
		//String str1 = "leetcode";
		//String str2 = "leeto";
		System.out.println(str1.indexOf(str2));	
		System.out.println(str2.indexOf(str1));	
		
		System.out.println(str1.indexOf(emptyPrefix));	
		System.out.println(str2.indexOf(emptyPrefix));	
	}
	
	public static void main(String[] args) {
		String [] strArray = {"flower","flow","flight"};
		System.out.println("Longest Prefix: "+longestCommonPrefix(strArray));
		
		String [] strArray1 = {"dog","racecar","car"};
		//System.out.println("Longest Prefix: "+longestCommonPrefix(strArray1));
		//check();
		
		String [] strArray2 = {"c","acc","ccc"};
		//System.out.println("Longest Prefix: "+longestCommonPrefix(strArray2));
		
		String [] strArray3 = {"abca","aba","aaab"};
		//System.out.println("Longest Prefix: "+longestCommonPrefix(strArray3));
		
				
	}

}
