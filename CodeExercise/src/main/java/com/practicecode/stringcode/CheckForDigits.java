package com.practicecode.stringcode;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.regex.Pattern;

public class CheckForDigits {

	// Solution#1: Digits 
	public boolean stringOnlyDigits(String str) {
		if (str.matches("[0-9]+")) {
			return true;
		} else 
			return false;
	}
	
	// Solution#2: Regular Expression
	public boolean stringOnlyDigitsByRegularPattern(String str) {
		Pattern pattern = Pattern.compile(".*[^0-9].*");
		return !pattern.matcher(str).matches();   
	}
	
	// Solution#3: atoi: String -> int
	public void convertStringToInt(String str) {
		if (stringOnlyDigits(str)) {
			System.out.println("Convert to "+convertIntByParse(str));
			System.out.println("Convert to "+convertIntByValueOf(str));
		} else {
			System.out.println("Cannot convert to digits");
		}
	}
	
	private Integer convertIntByParse(String str) {
		return Integer.parseInt(str);
	}
	
	private Integer convertIntByValueOf(String str) {
		return Integer.valueOf(str);
	}
	
	@Test
	public void testDigitOnly () {
		String strTest1 = "334579012";
		//Assert.assertTrue(stringOnlyDigits(strTest1),"No Digits");
		convertStringToInt(strTest1);
		
		//String strTest2 = "334579012te";
		//Assert.assertTrue(stringOnlyDigitsByRegularPattern(strTest2),"No Digits");
	}
}