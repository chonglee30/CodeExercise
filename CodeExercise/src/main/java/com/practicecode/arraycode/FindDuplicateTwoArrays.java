package com.practicecode.arraycode;
import java.util.Set;
import java.util.HashSet;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindDuplicateTwoArrays {

	public String findDuplicateTwoArrays() {
		int arr1[] = {1, 3, 5, 7, 8};
		int arr2[] = {0, 2, 4, 7, 9};

		String duplicateValue=null;
		
		Set<Integer> arrSet = new HashSet<Integer>();
		for (int i=0; i<arr1.length; i++) {
			arrSet.add(arr1[i]);
		}
		
		for (int i=0; i<arr2.length; i++) {
			if (arrSet.contains(arr2[i])) {
				duplicateValue = String.valueOf(arr2[i]);
			}
		}
		return duplicateValue;
	}
	
	@Test
	public void testDuplicateTwoArrays() {
		System.out.println("Duplicate Value: "+findDuplicateTwoArrays());
	}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
	} */

}
