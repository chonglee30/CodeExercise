package com.practicecode.stringcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckForVowels {

	// Solution: Vowel Count
	public int countVowels(String str) {
		
		int numVowels =0;
		
		for (int i=0; i<str.length(); i++) {
			switch (str.charAt(i)) {
			case 'a': 
			case 'e': 
			case 'i': 
			case 'o': 
			case 'u': 
			case 'y': 
				numVowels++;
			
			break;
			default:
			}	
		}
		return numVowels;
	}
	
	@Test
	public void testVowelsCount() {
		String str ="morning";
		System.out.println("Vowel Count:"+countVowels(str));
	}
	
}
