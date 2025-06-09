package com.practicecode.mathcode;

import org.testng.Assert;
import org.testng.annotations.Test;

// Leetcode 509. Fibonacci Number
// https://leetcode.com/problems/fibonacci-number/description/
// Reference Link: 
// https://www.javatpoint.com/fibonacci-series-in-java
// https://www.programiz.com/java-programming/examples/fibonacci-series
// a series where the next term is the sum of the previous two terms. 
// first two terms of the Fibonacci sequence are 0 followed by 1.
// Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

// Javascript: https://www.youtube.com/watch?v=T643rQ70Jlk

// Leetcode 70. Climbing Stairs
// https://leetcode.com/problems/climbing-stairs/
// https://www.youtube.com/watch?v=cveFizvVvQU
	
public class CheckForFibonacci {

	public void printFibonacciLoop() {
		int totalNum =9;
		
		int firstNum =0;
		int secondNum=1;
		int sum =0;
		
		for (int i=0; i<totalNum; i++) {
			System.out.print(firstNum+",");
			sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
		}
	}
	
	// Check to determine Fibonacci
	public boolean checkFibonacci(int [] array) {	
		int first =0;
		int second =1;
		int sum;
		boolean fiboStatus = false;
		int index =1;
		
		for (int i=2; i< array.length; i++) {
			sum = first + second;
			System.out.println("Sum:"+sum);
			System.out.println("Array:"+array[i]);
			if (array[i] == sum) {
				fiboStatus = true;
				first = second;
				index++;
				
				if (index < array.length) {
				  second = sum; //array[index];
				}
				
			} else {
				fiboStatus = false;
				break;
			} 
				
		}
		
		return fiboStatus;
	}
	
	public int fib(int n) {
		int firstNum = 0;  // f(0) = 0
		int secondNum = 1; // f(1) = 1
		int sum =0;
		
		if (n==0) return firstNum;
		if (n==1) return secondNum;
		
		for (int i=1; i<n; i++) {
			sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
		}
		return sum;
    }
	
	public int climbStairs(int n) {
        int firstNum = 1;   // f(1)
        int secondNum = 2;  // f(2)
        int sum =0;
        
        if (n==1) return firstNum;
        if (n==2) return secondNum;
        
        for (int i=3; i<=n; i++) {
        	sum = firstNum + secondNum;
        	firstNum = secondNum;
        	secondNum = sum;
        }
        return sum;
    }
	
	@Test( enabled=false )
	public void testReverse() {
		printFibonacciLoop();	
		
		int [] array = {0,1,1,2,3,5,8,13};
		
		//Assert.assertTrue(checkPalindromeV2(str), "Not Palindrome");
		Assert.assertTrue(checkFibonacci(array), "Not Fibonacci");
		
	}
	
	@Test
	public void testFibonacci() {
		int n0=1;
		System.out.println("n: "+n0 +" Sum: "+fib(n0));
		
		int n1=2;
		System.out.println("n: "+n1 +" Sum: "+fib(n1));
		
		int n2 =3;
		System.out.println("n: "+n2 +" Sum: "+fib(n2));
		
		int n3 =4;
		System.out.println("n: "+n3 +" Sum: "+fib(n3));
	}


	// Check Stairs:
	@Test
	public void testClimbingStairs() {
		int n1 = 3;
		System.out.println("Stairs: "+climbStairs(n1));
		
		int n2 = 4;
		System.out.println("Stairs: "+climbStairs(n2));
		
		int n3 = 5;
		System.out.println("Stairs: "+climbStairs(n3));
	}
}
