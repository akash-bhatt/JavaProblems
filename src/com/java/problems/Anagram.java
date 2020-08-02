package com.java.problems;

public class Anagram {
	
	public boolean isAnagram(String str1, String str2) {
		
		boolean isAnagram = false;
		int counter = 0;
		
		char[] firstString = str1.toLowerCase().toCharArray();
		char[] secondString = str2.toLowerCase().toCharArray();
		
		if(firstString.length == secondString.length) {
		
		for(int i =0; i<firstString.length; i++) {
			for (int j=0; j<secondString.length; j++) {
				if(firstString[i]  == secondString[j]) {
					counter ++;
					break;
				}
			}
		}
		}
		if(counter == firstString.length) {
			isAnagram = true;
		}
		return isAnagram;
	}
	
	public static void main (String args[]) {
		System.out.println("Is Anagram::" + new Anagram().isAnagram("hellogeeks", "geekslleho"));
	}

}
