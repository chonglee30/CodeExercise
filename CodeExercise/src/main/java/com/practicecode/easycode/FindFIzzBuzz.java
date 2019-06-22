package com.practicecode.easycode;

import java.util.Scanner;

// Input:



public class FindFIzzBuzz {

	public static void printFizzBuzzFromUserInput() {
        Scanner in = new Scanner(System.in);
        Integer totInput = in.nextInt();
        
        for (int i=0; i<totInput; i++) {
            Integer numInput = in.nextInt();
            
            for (int j=1; j<=numInput; j++) {
              if ((j%3)==0) {
                 System.out.println("Fizz");
              } else if ((j%5)==0) {
                 System.out.println("Buzz");
              } else if ((j%3)==0 &&
                       (j%5)==0) {
                 System.out.println("FizzBuzz");
              } else {
                 System.out.println(j);
              }
            }
        }       
	}
	
	public static void printFizzBuzzWhile() {
		Scanner in = new Scanner(System.in);
        Integer totInput = in.nextInt();
        
        for (int i=0; i<totInput; i++) {
            Integer numInput = in.nextInt();
            
            int j=1;
            int input = in.nextInt();
            while (j<input) {	
              if ((j%3)==0) {
                 System.out.println("Fizz");
              } else if ((j%5)==0) {
                 System.out.println("Buzz");
              } else if ((j%3)==0 && (j%5)==0) {
                 System.out.println("FizzBuzz");
              } else {
                 System.out.println(j);
              }
              j++;
            }
        }        
	}

//	public static printFizzBussUsingBufferedInput() {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printFizzBuzzFromUserInput();
		printFizzBuzzWhile();
	}

}
