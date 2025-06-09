package com.practicecode.stringcode;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public String removeWhiteSpace(String str) {
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<str.length(); i++) {
			if (Character.isWhitespace(str.charAt(i))) {
				
			} else {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}	
	
	public void printRemovedWhiteSpace() {
		//String str ="Tell me why";
		String pattern =",";
		Scanner in = new Scanner(System.in);
		in.useDelimiter(pattern);
		Integer totalInput = in.nextInt();

		  for (int i=0; i<totalInput; i++) {
		      String inputStr = in.next();
		      System.out.println(removeWhiteSpace(inputStr));
		  }       
		
	}
	
	public static void main(String[] args) {
		String str ="Tell me why";
		RemoveWhiteSpace removeWhiteSpace = new RemoveWhiteSpace();
		removeWhiteSpace.printRemovedWhiteSpace();
	}
 
}
