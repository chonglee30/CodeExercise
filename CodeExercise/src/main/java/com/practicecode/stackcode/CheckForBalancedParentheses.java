package com.practicecode.stringcode;

import java.util.Stack;
import java.util.EmptyStackException;
import java.util.Scanner;

public class CheckForBalancedParentheses {

	public boolean isBalancedParentheses(String input) {
	
		Stack<Character> stack = new Stack<Character>();
		
		int inputSize = input.length();
		
		for (int i=0; i<inputSize; i++) {
			if (input.charAt(i) =='(') {
				stack.push(input.charAt(i));
			} else if (input.charAt(i)==')') {
				try {
					stack.pop();
				} catch (EmptyStackException emptyStack) {
					//emptyStack.printStackTrace();
					return false;
				}
			}
		}
		 
		return (stack.size()==0);
	}
	 
	public void evaluateBalancedParentheses() {
		Scanner in = new Scanner(System.in);
	    Integer totalInput = in.nextInt();
		
	    for (int i=0; i<totalInput; i++) {
	        String inputValues = in.next();
	    
	  		if (isBalancedParentheses(inputValues)) {
				System.out.println("Balanced parentheses");
			} else {
				System.out.println("Inbalanced (invalid) parentheses");
			}
	          
	     }        
	}
	
	public static void main(String[] args) {
		CheckForBalancedParentheses balancedParentheses = new CheckForBalancedParentheses();
		balancedParentheses.evaluateBalancedParentheses();
	}

}
