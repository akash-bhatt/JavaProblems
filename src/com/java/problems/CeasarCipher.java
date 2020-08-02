package com.java.problems;

public class CeasarCipher {

	public char[] encrypt(String str) {
		
		char[] aphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] input = str.toCharArray();
		char[] result = new char[input.length];
		int index = 0;
		
		for(int i=0; i<input.length; i++) {
			for(int j =0; j<aphabets.length; j++) {
				if(input[i]==aphabets[j]) {
					if((j+4) >aphabets.length) {
						index = (j+4)-aphabets.length;
						result[i] = aphabets[index];
					}
					else {
						result[i] = aphabets[j+4];
					}
					break;
				}
			}
		}
		System.out.println("Result String ::" + new String(result));
		return result;
		
	}
	
	public static void main (String args[]) {
		
		new CeasarCipher().encrypt("zebra");
	}
	
}
