package com.practicecode.stringcode;

public class LastWordLength {

	// 58. Length of Last Word
	// https://leetcode.com/problems/length-of-last-word/

	// Java References:
	// https://www.geeksforgeeks.org/java-split-string-by-space/
	// https://www.geeksforgeeks.org/trim-remove-leading-trailing-spaces-string-java/
	public static int lengthOfLastWord(String s) {
		String [] strWords = s.trim().split("\\s+");
		System.out.println("Total words:"+strWords.length);
		int lastWordLength = strWords[strWords.length - 1].length();
		
		return lastWordLength;
    }
	
	public static void main(String[] args) {
		String s1 = "Hello World";
		System.out.println(lengthOfLastWord(s1));
		
		String s2 = "   fly me   to   the moon  ";
		System.out.println(lengthOfLastWord(s2));
		
		String s3 = "luffy is still joyboy";
		System.out.println(lengthOfLastWord(s3));
		
		String s4 = "     Java   Programming!      ";
		System.out.println(lengthOfLastWord(s4));
	}

}
