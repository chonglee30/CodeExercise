package com.practicecode.stringcode;
import java.util.List;
import java.util.ArrayList;

public class CheckForStr {

	/*
	 *  Inputs: "abc", "bc"
		Output: true
	 */	
	public static boolean solution(String str, String ending) {
	    //return false;
	   //char[] charArray = str.toCharArray();
	    boolean sameEnding = true;
	    if (str.indexOf(ending) ==-1) return false;
	    
	    int endLength = ending.length();
	    int start = str.length() - endLength;
	    
	    int index =0;
	    for (int i=start; i<str.length()-1; i++) {
	    	
    		if (str.charAt(i) != ending.charAt(index)) {
    			sameEnding=false;
    			break;
    		}
	    	index++;	
	    }
	    return sameEnding;
	}
	
	public static boolean solution1(String str, String ending) {
		 if (str.indexOf(ending) ==-1) return false;
		 boolean sameEnding = str.substring(str.length() - ending.length()).equals(ending);
		 return sameEnding;
	}
	
	public static List<String> friend(List<String> x){
		
		List<String> friendList = new ArrayList<>();
		
		for (String name: x) {
			if (name.length() == 4) {
				friendList.add(name);
			}
		}
		
		//return null;
		return friendList;
	}
	
	/* Other Options:
	 * static List<String> friend(List<String> names) {
    	return names.stream().filter(s -> s.length() == 4).toList();
  	  }
	 * 
	 * Ex1: List<String> planets = List.of("Mercury", "Venus", "Earth", "Mars");
     * Ex2: List<Integer> primeNumbers = List.of(2, 3, 5, 7, 11); 
	 * 
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
