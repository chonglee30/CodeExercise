package com.practicecode.stringcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckForPalindrome {

	public boolean isPalindrome(String word) {
		
		CheckForReverse reversedString = new CheckForReverse();
		String reversedWord = reversedString.reverseString(word);
		return (word.equals(reversedWord)? true: false);
	}
	
	
	@Test
	public void tetPalindrome() {
		String str ="abba";
		Assert.assertTrue(isPalindrome(str), "Not Palindrome");
	}
	
}
