package com.practicecode.stringcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckForAnagram {
		
	// Time Complexity (n^2)
	// Space Complexity(1)	
	public boolean checkAnagramClassic(String src, String des) {
		Boolean isAnagram = false;
		
		if (src.length() != des.length()) {
			return false;
		}
		
		for (int i=0; i<src.length(); i++) {
			for (int j=0; j<des.length(); j++) {
				if (src.charAt(i) == des.charAt(j)) {
					isAnagram=true;
					break;
				} else {
					isAnagram = false;
				}
			}
		}
		return isAnagram;
	}
	
	// Time Complexity (n)
	// Space Complexity(n)	
	public boolean checkAnagramVer2(String src, String des) {	
		Boolean isAnagram = false;
		
		if (src.length() != des.length()) {
			return false;
		}
		
		StringBuilder sbDes = new StringBuilder(des);
		char [] srcArray = src.toCharArray();
		
		for (char c : srcArray) {
			int index = sbDes.indexOf(""+c);
			if (index != -1) {
				sbDes.deleteCharAt(index);
			}
		}
		return (sbDes.length() == 0? true: false);
	}
	
	@Test (enabled=false)
	public void testAnagramClassic() {
		String sourceStr = "abbc";
		String destinationStr = "bacb";
		Assert.assertTrue(checkAnagramClassic(sourceStr, destinationStr), "Not Anagram");
	}
	
	@Test
	public void testAnagramVer2() {
		String sourceStr = "mary";
		String destinationStr = "army";
		Assert.assertTrue(checkAnagramVer2(sourceStr, destinationStr), "Not Anagram");
	}
	
}