package com.practicecode.stringcode;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class ReverseWords {

	public void reverseWords(String sentence) {
		String [] words = sentence.split("\\s");
		
		StringBuilder sb = new StringBuilder();
		for (int i= words.length-1; i>=0; i--) {
			sb.append(words[i]).append(" ");
		}
		
		System.out.println("Reversed Words: "+sb.substring(0, sb.length()-1));
	}
	
	
	
	
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
*/
	
	@Test
	public void testReverseWords() {
		reverseWords("I am a boy!");
		//System.out.println("Duplicate Value: "+findDuplicateTwoArrays());
	}
	
}
