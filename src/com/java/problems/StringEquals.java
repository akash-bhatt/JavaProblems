package com.java.problems;

public class StringEquals {
	
	public boolean isStringEquals(String str, String srch) {
		
		boolean isStringEquals = false;
		
		char[] firstString = str.toCharArray();
		char[] secondString = srch.toCharArray();
		
		int minLength = secondString.length;
		
		int counter = 0;
		boolean found = false;
		
		for(int i=0; i<secondString.length; i++) {// small
			for(int j=0; j<firstString.length; j++) { // large
				if(secondString[i] == firstString[j]) {
					found = true;
				}
			}
			if(found) {
				counter++;
			}		
		}
		
		if(counter == minLength) {
			isStringEquals = true;
		}
		return isStringEquals;
		
	}
	
	public static void main (String args[]) {
		
		System.out.println(new StringEquals().isStringEquals("apple", "Ape"));
		
			}

}
