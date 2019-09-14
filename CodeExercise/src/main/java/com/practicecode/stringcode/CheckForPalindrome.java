package com.practicecode.stringcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckForPalindrome {

	// Check: By Reverse
	public boolean isPalindrome(String word) {
		
		CheckForReverse reversedString = new CheckForReverse();
		String reversedWord = reversedString.reverseString(word);
		return (word.equals(reversedWord)? true: false);
	}
	
	
	// Check: 
	public boolean checkPalindrome(String str) {
		
		int firstIndex =0;
		int lastIndex = str.length()-1;
		boolean palindrome = true;
		
		while (lastIndex > firstIndex) {
			if (str.charAt(lastIndex)!= str.charAt(firstIndex)) {
				palindrome = false;
			}
			firstIndex ++;
			lastIndex--;
		}
		return palindrome;
	}
	
	
	@Test
	public void tetPalindrome() {
		String str ="madam";
		Assert.assertTrue(isPalindrome(str), "Not Palindrome");
		Assert.assertTrue(checkPalindrome(str), "Not Palindrome");
	}
	
}
