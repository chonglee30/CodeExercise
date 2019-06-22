package com.practicecode.stringcode;

import java.util.Scanner;

public class CheckForStringRotation {

	// Solution#1:
	private boolean isStringRotatedOtherByConcatenation(String s1, String s2) {
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
	
	// Evaluate: Calling Solution#1
	public void evaluateStringRotation() {
		Scanner in = new Scanner(System.in);
	    Integer totalInput = in.nextInt();
		
	    for (int i=0; i<totalInput; i++) {
	        String firstValue = in.next();
	        String secondValue = in.next();
	        
	        if (isStringRotatedOtherByConcatenation(firstValue, secondValue)) {
				System.out.println("Rotated");
			} else {
				System.out.println("Not Rotated");
			}    
	     }        
	}
	
	public static void main(String[] args) {		
		CheckForStringRotation strRotation = new CheckForStringRotation();
		strRotation.evaluateStringRotation();
	}

}