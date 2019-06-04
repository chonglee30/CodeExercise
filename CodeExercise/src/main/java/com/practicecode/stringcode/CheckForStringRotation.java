package com.practicecode.stringcode;

public class CheckForStringRotation {

	public boolean isStringRotatedOtherByConcatenation(String s1, String s2) {
		boolean rotated=false;
		
		if (s1==null || s2==null) {
			rotated = false;
			return false;
		} else if (s1.length() != s2.length()) {
			rotated = false;
			return false;
		} else {
			String combinedStr = s1.concat(s1);
			if (combinedStr.contains(s2)) {
				rotated = true;
				return true;
			} else {
				rotated = false;
			}
		}
		
		return rotated;
	}
	
	public static void main(String[] args) {
		
		String s1="abcd";
		String s2="bcda";
		
		CheckForStringRotation strRotation = new CheckForStringRotation();
		if (strRotation.isStringRotatedOtherByConcatenation(s1, s2)) {
			System.out.println("Rotated");
		} else {
			System.out.println("Not Rotated");
		}

	}

}
