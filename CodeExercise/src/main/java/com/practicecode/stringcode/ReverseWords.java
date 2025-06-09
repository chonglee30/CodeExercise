package com.practicecode.stringcode;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

// Reverse String and Words
// A. Reverse String:
// a. Leetcode 344 Reverse String
// https://leetcode.com/problems/reverse-string/
// https://www.youtube.com/watch?v=jqriPDjg4UE
// https://www.youtube.com/watch?v=NA--2JiDaeQ

// 541. Reverse String II
// https://leetcode.com/problems/reverse-string-ii/
// https://www.youtube.com/watch?v=hyaKe7Bgst8&pp=ygUSI3JldmVyc2FsYWxnb3JpdGht
// https://www.youtube.com/watch?v=cbf4K6t0kBI
 
// B. Reverse Words:
// a. Leetcode 151. Reverse Words in a String
// https://leetcode.com/problems/reverse-words-in-a-string/description/
// https://www.youtube.com/watch?v=bI3GrI5w-WE

// b. Leetcode 557. Reverse Words in a String III
// https://leetcode.com/problems/reverse-words-in-a-string-iii/description/

public class ReverseWords {
	/*  My Initial Attempt
	public void reverseString(char[] s) {
		StringBuilder sb = new StringBuilder();
		int length = s.length;

		for (int i = length-1; i>=0; i--) {
			sb.append(s[i]);
		}
	
		System.out.println(sb.toString());		
		char [] c = sb.toString().toCharArray();
        s = c;
    }*/
	
	// Some hint from Youtube to clear understanding of problem
	public void reverseString(char[] s) {
		int firstIndex =0;
		int lastIndex = s.length -1;
		char temp = '\0';
		
		while (firstIndex < lastIndex) {
			temp = s[firstIndex];
			s[firstIndex] = s[lastIndex];
			s[lastIndex] = temp;
			firstIndex++;
			lastIndex--;
			System.out.println("first:"+firstIndex);
			System.out.println("last:"+lastIndex);
		}	
	} 
	
	// Another way 
	/*
	for (int i=0; i<s.length/2; i++) {
		char temp = s[i];
		s[s.length-1-i] = temp;
		s[i] = [s.length-1-i];
	} */
	
	/*
	public void reverseWords(String sentence) {
		String [] words = sentence.split("\\s");
		
		StringBuilder sb = new StringBuilder();
		for (int i= words.length-1; i>=0; i--) {
			sb.append(words[i]).append(" ");
		}
		
		System.out.println("Reversed Words: "+sb.substring(0, sb.length()-1));
	} */
	
	
	public String reverseWords(String s) {
		//System.out.println(s);
		//String reversedStr = s.trim();
		String [] reversedStr = s.trim().split("\\s+");
		int rStrLength = reversedStr.length;
		//System.out.println(rStrLength);
				
		/*
		int firstIndex = 0;
		int lastIndex = rStrLength -1;
		
		while (firstIndex < lastIndex) {
			String temp = reversedStr[firstIndex];
			reversedStr[firstIndex] = reversedStr[lastIndex];
			reversedStr[lastIndex] = temp;
			
			firstIndex++;
			lastIndex--;
		}
		
		String str = Arrays.toString(reversedStr);
		System.out.println(str);
		*/
		
		StringBuilder sb = new StringBuilder();
		for (int i=rStrLength -1; i>=0; i--) {
			sb.append(reversedStr[i]);
			if (i>0) sb.append(" ");
		}
		//System.out.println(sb.toString());
		return sb.toString();
    }
	
	//  Leetcode 557. Reverse Words in a String III
	public String reverseStringWords(String s) {
		String [] strArray = s.trim().split("\\s+");
		int strArrayLength = strArray.length;
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i< strArrayLength; i++) {
			char [] charArray = strArray[i].toCharArray();
			int firstIndex =0;
			int lastIndex = charArray.length-1;
			char temp ='\0';
			
			while (lastIndex>firstIndex) {
				temp = charArray[lastIndex];
				charArray[lastIndex] = charArray[firstIndex];
				charArray[firstIndex] = temp;
				firstIndex++;
				lastIndex --;
			}
			String str = String.valueOf(charArray);
			sb.append(str+" ");
		}
		return sb.toString().trim();
	}
	
	// Leetcode 541
	// My Initial Solution - ran into issue with Case4
	/*
	public String reverseStr(String s, int k) {
        
		// Case1: less than K Length
		// reverse all characters
		int firstIndex =0;
		int lastIndex;
		char temp ='\0';
		char [] charArray = s.toCharArray();
		int size = k;
				
		if (s.length() < k) {
			lastIndex = s.length()-1;
			while (lastIndex > firstIndex) {
				temp = charArray[lastIndex];
				charArray[lastIndex] = charArray[firstIndex];
				charArray[firstIndex] = temp;
				firstIndex++;
				lastIndex --;
			}
		}
		
		// Case2: less than 2K Length, but greater than k Length
		// reverse first k characters
		else if ( (s.length() >= k) && (s.length() <= (2*k))) {
			//System.out.println("Case2 - k <= s.length < 2k");
			lastIndex = k-1;
			//System.out.println("Last: "+lastIndex);
			while (lastIndex > firstIndex) {
				temp = charArray[lastIndex];
				charArray[lastIndex] = charArray[firstIndex];
				charArray[firstIndex] = temp;
				firstIndex++;
				lastIndex --;
			}
		}
		
		else { //  all other cases
			lastIndex = k-1;
			System.out.println("Last: "+lastIndex);
			while (s.length() > k) {
				while (lastIndex > firstIndex) {
					temp = charArray[lastIndex];
					charArray[lastIndex] = charArray[firstIndex];
					charArray[firstIndex] = temp;
					firstIndex++;
					lastIndex --;
				}
				k=2*k;
				firstIndex=k;
				lastIndex = k+size-1;
				if (lastIndex> s.length()-1) break;
			}		
		}		
		return String.valueOf(charArray).toString();
    } */
	
	 // After Youtube Hint:
	 public String reverseStr(String s, int k) {
		 char [] charArray = s.toCharArray();
		 
		 for (int i=0; i< s.length(); i+=2*k) {
			 int start =i;
			 int end = Math.min(i+k-1,  charArray.length-1);
			 while (start < end) {
				 char temp = charArray[start];
				 charArray[start++] = charArray[end];
				 charArray[end--] = temp;
			 }
		 }
		 return String.valueOf(charArray);
	 }
	
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
*/
	
	/*
	@Test
	public void testReverseString() {
		reverseWords("I am a boy!");
		//System.out.println("Duplicate Value: "+findDuplicateTwoArrays());
		
		char []s1 = {'h','e','l','l','o'};

		reverseString(s1);
	}
	
	@Test
	public void testReverseWords() {
		
		String s1 = "I am a boy!";
		System.out.println(reverseWords(s1));
		//System.out.println("Duplicate Value: "+findDuplicateTwoArrays());
		
		String s2 = "the sky is blue";
		System.out.println(reverseWords(s2));
		
		String s3 = "  hello world  ";
		System.out.println(reverseWords(s3));
		
		String s4 = "a good   example";
		System.out.println(reverseWords(s4));

	}
	
	@Test
	public void testReverseStringWords() {

		System.out.print("Reversed String in Words: ");
		String s1 = "Let's take LeetCode contest";
		System.out.println(reverseStringWords(s1));
		
		String s2 = "Mr Ding";
		System.out.println(reverseStringWords(s2));
	}*/
	
	@Test
	public void testStringTwo() {
		System.out.print("Reversed String2: ");
		String s1 = "abcdefg"; 
		int k1 = 2;
		System.out.println(reverseStr(s1, k1));		
		
		String s2 = "abcd";
		int k2 = 2;
		System.out.println(reverseStr(s2, k2));
		
		String s3 = "abcdefg";
		int k3 = 3;
		System.out.println(reverseStr(s3, k3));
		
		// Case4:
		String s4 = "hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl";
		int k4 = 39;
		
		// Expected Answer:
		//"fdcqkmxwholhytmhafpesaentdvxginrjlyqzyhehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqllgsqddebemjanqcqnfkjmi"
		
		//Actual: 
		// "fdcqkmxwholhytmhafpesaentdvxginrjlyqzyhehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl"	

		
	}
	
}
