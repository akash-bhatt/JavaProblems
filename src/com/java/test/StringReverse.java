package com.java.test;

public class StringReverse {
	
	public void stringReverse(String str) {
		
		char[] str1 = str.toCharArray();
		
		char[] result = new char[str1.length];
		
		for(int i=0; i<str1.length; i++) {
			result[i] = str1[str1.length - (i +1)];
		}
		
		System.out.println("Reverse String" + new String(result));
	}
	
	public static void main(String args[]) {
		new StringReverse().stringReverse("Hello");
	}

}
