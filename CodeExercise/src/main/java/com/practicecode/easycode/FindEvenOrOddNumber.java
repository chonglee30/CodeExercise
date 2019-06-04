package com.practicecode.easycode;

public class FindEvenOrOddNumber {
	
	public void findEvenOddNumberByModule(int number) {
		if (((number%2)==0)) {
			System.out.println(number+" is Even Number.");
		} else {
			System.out.println(number+" is Odd Number.");
		}
	}
		 
	public void findEvenOddNumberByQuotient(int number) {
		int quotient = number/2;
		
		if ((quotient*2)==number) {
			System.out.println(number+" is Even Number");
		} else if ((quotient*2) < number) {
			System.out.println(number+" is Odd Number");
		}
	}
	
	public static void main(String[] args) {
		FindEvenOrOddNumber evenOddNumber = new FindEvenOrOddNumber();
		evenOddNumber.findEvenOddNumberByModule(3);
		evenOddNumber.findEvenOddNumberByModule(10);

		evenOddNumber.findEvenOddNumberByQuotient(4);
		evenOddNumber.findEvenOddNumberByQuotient(33);

	}

}
