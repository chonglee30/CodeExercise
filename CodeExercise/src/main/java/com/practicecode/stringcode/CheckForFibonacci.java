package com.practicecode.stringcode;

import org.testng.Assert;
import org.testng.annotations.Test;

// Reference Link: 
// https://www.javatpoint.com/fibonacci-series-in-java
// https://www.programiz.com/java-programming/examples/fibonacci-series

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
	
	
	@Test
	public void testReverse() {
		printFibonacciLoop();	
	}

}
