package com.practicecode.easycode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindEvenOrOddNumber {
	
	public String findEvenOddNumberByModule(int number) {
		String numType;
		
		if (((number%2)==0)) {
			System.out.println(number+" is Even Number.");
			numType = "Even";
		} else {
			System.out.println(number+" is Odd Number.");
			numType = "Odd";
		}
		return numType;
	}
		 
	public String findEvenOddNumberByQuotient(int number) {
		String numType=null;
		int quotient = number/2;
		
		if ((quotient*2)==number) {
			System.out.println(number+" is Even Number");
			numType = "Even";
		} else if ((quotient*2) < number) {
			System.out.println(number+" is Odd Number");
			numType = "Odd";
		}
		return numType;
	}
	
	@Test(groups="Freshman")
	public void testNumberTypeByModule() {
		FindEvenOrOddNumber evenOddNumber = new FindEvenOrOddNumber();	
		Assert.assertEquals(evenOddNumber.findEvenOddNumberByModule(3), "Odd");
		Assert.assertEquals(evenOddNumber.findEvenOddNumberByModule(10), "Even");
	}
	
	@Test
	public void testNumberTypeByQuotient() {
		FindEvenOrOddNumber evenOddNumber = new FindEvenOrOddNumber();	
		Assert.assertEquals(evenOddNumber.findEvenOddNumberByQuotient(4), "Even");
		Assert.assertEquals(evenOddNumber.findEvenOddNumberByQuotient(33), "Odd");
	}
}
