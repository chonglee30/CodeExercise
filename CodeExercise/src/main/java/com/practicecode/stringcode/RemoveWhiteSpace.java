package com.practicecode.stringcode;

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
	
	
	public static void main(String[] args) {
		String str ="Tell me why";
		RemoveWhiteSpace removeWhiteSpace = new RemoveWhiteSpace();
		System.out.println(removeWhiteSpace.removeWhiteSpace(str));
	}

}
