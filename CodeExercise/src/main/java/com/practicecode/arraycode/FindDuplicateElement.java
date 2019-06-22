package com.practicecode.arraycode;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// Reference Link: Try other way:
// https://javarevisited.blogspot.com/2015/06/3-ways-to-find-duplicate-elements-in-array-java.html#axzz5pXiCghUq

public class FindDuplicateElement {

	public List<Character> findDuplicateCharsBySet(String str) {
	    int strLength = str.length();
	    Set<Character> charSet = new HashSet<Character>();
	    List<Character> duplicateList = new ArrayList<Character>();
	    
	    for (int i =0; i<strLength; i++) {
	    	if (charSet.add(str.charAt(i))) {
	    	} else {
	    		duplicateList.add(str.charAt(i));
	    	}
	    }
		return duplicateList;
	}
	
	public static void main(String[] args) {
		String str ="baseball";
		FindDuplicateElement duplicateElement = new FindDuplicateElement();
		System.out.println("Duplicate Characters: "+Arrays.toString(duplicateElement.findDuplicateCharsBySet(str).toArray()));
	}

}
