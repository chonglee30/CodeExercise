package com.practicecode.stackcode;

import java.util.Stack;
import java.util.EmptyStackException;
import java.util.Scanner;

import java.util.Deque;
import java.util.ArrayDeque;

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
	
	public boolean checkBalancedParenthesesDeque(String input) {
		char [] charArray = input.toCharArray();
		Deque<Character> stack = new ArrayDeque<>();
		
		if (charArray.length ==0)
			return false;
		
		for (char c : charArray) {
			if ((c == '(') || 
				(c == '{') ||	
				(c == '[')) {
				stack.addFirst(c);
			}
			
			else if ((c == ')') && (!stack.isEmpty()) && stack.peekFirst() == '(')  {
				stack.removeFirst();
			}
			
			else if ((c == '}') && (!stack.isEmpty()) && stack.peekFirst() == '{')  {
				stack.removeFirst();
			}
			
			else if ((c == ']') && (!stack.isEmpty()) && stack.peekFirst() == '[')  {
				stack.removeFirst();
			}
		}
		
		if (stack.isEmpty()) 
			return true;
		
		return false;
	}
	 

	//Leetcode 20. Valid Parentheses
	//https://leetcode.com/problems/valid-parentheses/
	//https://www.youtube.com/watch?v=9kmUaXrjizQ
	public void evaluateBalancedParentheses(String str) {
		//Scanner in = new Scanner(System.in);
	    Integer totalInput = str.length();
		
	   // for (int i=0; i<totalInput; i++) {
	    //    Character inputValues = str.charAt(i);
	    
	  		if (isBalancedParentheses(str)) {
				System.out.println("Balanced parentheses");
			} else {
				System.out.println("Inbalanced (invalid) parentheses");
			}
	          
	     //}        
	}
	
	// My Solution:
	/*
	public boolean isValid(String s) {
		char [] chars = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		
		for (char c : chars) {
			if (c == '(' || c=='[' || c=='{') {
				stack.push(c);
			}
						
			if (c==')') {
				if (stack.isEmpty()) return false;
				if (stack.peek() == '(') stack.pop(); 
				else return false;
			}
			
			if (c==']') {
				if (stack.isEmpty()) return false;
				if (stack.peek() == '[') stack.pop(); 
				else return false;
			}
			
			if (c=='}') {
				if (stack.isEmpty()) return false;
				if (stack.peek() == '{')   stack.pop(); 
				else return false;
			}
		}
		
		if (stack.isEmpty()) return true; 
		else return false;
    } */
	
	// After Watching Youtube Hint: more concise code
	public boolean isValid(String s) {
		
		// Has to be even 
		if (s.length() % 2 !=0) return false;
		
		Stack<Character> stack = new Stack<Character>();
		
		for (char c : s.toCharArray()) {
			if (c == '(' || c=='[' || c=='{') {
				stack.push(c);
			} else if (c==')' && !stack.isEmpty() && stack.peek() == '(' ) {
				stack.pop();
			}
			else if (c=='}' && !stack.isEmpty() && stack.peek() == '{' ) {
				stack.pop();
			}
			else if (c==']' && !stack.isEmpty() && stack.peek() == '[' ) {
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		CheckForBalancedParentheses balancedParentheses = new CheckForBalancedParentheses();
		balancedParentheses.evaluateBalancedParentheses("3+4");
		// [{()}]
		System.out.println(balancedParentheses.checkBalancedParenthesesDeque("{[(9+10)]}"));
		
		String s1 = "()";
		System.out.println(balancedParentheses.isValid(s1));
		
		String s2 = "()[]{}";
		System.out.println(balancedParentheses.isValid(s2));
		
		String s3 = "(]";
		System.out.println(balancedParentheses.isValid(s3));
		
		String s4 = "([])";
		System.out.println(balancedParentheses.isValid(s4));
		
		String s5 = "]";
		System.out.println(balancedParentheses.isValid(s5));
		
		String s6 = "(])";
		System.out.println(balancedParentheses.isValid(s6));
	}

}
