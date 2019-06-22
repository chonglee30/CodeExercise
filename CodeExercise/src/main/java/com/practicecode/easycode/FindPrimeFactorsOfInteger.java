package com.practicecode.easycode;

//  Conditions of Prime Factors: 
// 1. Must be greater than 1 
// 2. Divisible by 1 and itself
// 3. Even numbers other than 2 are not prime number 
// 4. 2 is prime number		

public class FindPrimeFactorsOfInteger {

	// Version1: My version
	private boolean isPrimeNumber(int number) {
		
		boolean factorialNumber = false;
		
		if (number <=1) {
			return false;
		} else if (number == 2 || 
				   number == 3 ||
				   number == 5) {
			return true;
		}
		
		if ((number %2)==0) {
			return false;
		}
		
		int maxDivisor = (number/2);
		
		for (int i=2; i<maxDivisor; i++) {
			
			if ((number%i)==0) {
				factorialNumber = false;
				break;
			} else {
				factorialNumber = true;
			}
		}
		return factorialNumber;
	}
	
	// Version2: 
	private boolean isPrime(int number) {
		
		for (int i=2; i<number; i++) {
			if (number%i ==0) {
				return false;
			}
		}
		return true;
	}
	
	public void primeFactorialNumber(int number) {
		if (isPrimeNumber(number)) {
			System.out.println("Prime Number!");
		} else {
			System.out.println("Not Prime Number!");
		}
	}
	
	public void printPrimeNumber() {
		int limit =30;
		for (int num=2; num<limit; num++) {
			if (isPrime(num)) {
				System.out.print(num);
				System.out.print(",");
			}
		}
	}

	public static void main(String[] args) {
		FindPrimeFactorsOfInteger primeFactor = new FindPrimeFactorsOfInteger();
		primeFactor.primeFactorialNumber(45);
		primeFactor.printPrimeNumber();
	}

}
