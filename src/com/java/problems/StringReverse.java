package com.java.problems;

public class StringReverse {
	
	public String getReverseString(String str) {
		
		char [] var = str.toCharArray() ;
		char [] result = new char[var.length];
		
		for (int i=0; i<var.length; i++) {
			char a = var[var.length-(i+1)];
			result[i] = a;
		}
		
		return new String(result);
		
	}
	
	public static void main(String[] args) {
		System.out.println(new StringReverse().getReverseString("Deepa Kumar"));

	}

}
