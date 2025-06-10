package com.practicecode.stringcode;

public class FindIndexString {

	// Leetcode 28. Find the Index of the First Occurrence in a String
	// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
	// https://www.youtube.com/watch?v=SZEMg0ifAdY
	// https://algo.monster/liteproblems/28
	/*DSA Explain:
	https://www.youtube.com/watch?v=sCWgIoDnZus
	https://medium.com/@subhanamjad507/leetcode-28-find-the-index-of-the-first-occurrence-in-a-string-bf8e15260775
	https://medium.com/@rutujakbhombe19/leetcode-28-find-the-index-of-the-first-occurrence-in-a-string-03f36240f6bd

	KMP: https://www.youtube.com/watch?v=q4_90fOoS-s
    Good Explanation:
	https://www.youtube.com/watch?v=0iDiUuHZE_g
	https://algo.monster/liteproblems/28 
	*/
	
	public static int strStr(String haystack, String needle) {
       int nLength = needle.length();
       int hLength = haystack.length();
       
       char[] charArray = haystack.toCharArray();
       for (int i=0; i<(hLength-nLength); i++) {
    	   String substring = haystack.substring(i, nLength+i);
    	   if (substring.equals(needle)) {
    		   return i;
    	   }	
       }
       return -1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("sadbutsad", "sad"));
		System.out.println(strStr("leetcode", "leeto"));
		
	}

}
