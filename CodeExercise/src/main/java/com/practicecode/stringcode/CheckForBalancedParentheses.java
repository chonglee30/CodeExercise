package com.practicecode.stringcode;

import java.util.Stack;
import java.util.EmptyStackException;

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
	 
	public static void main(String[] args) {
		CheckForBalancedParentheses balancedParentheses = new CheckForBalancedParentheses();
		if (balancedParentheses.isBalancedParentheses("(())")) {
			System.out.println("Balanced");
		}
		
		if (balancedParentheses.isBalancedParentheses("((())))")) {
			System.out.println("Balanced parentheses");
		} else {
			System.out.println("Inbalanced (invalid) parentheses");
		}

	}

}
