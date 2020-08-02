package com.java.problems;

public class firstOccurence {
	
	
	public void findFirstOccurence(String str) {
		
		char[] str1 = str.toCharArray();
		
		char result = ' ';
		
		for(int i=0; i<str1.length; i++) {
			if(result != ' ') {
				break;
			}
			for(int j=0; j<i; j++) {
				if(str1[i] ==  str1[j]) {
					result = str1[i];
					break;
				}
			}
		}
			System.out.println("unique character" + Character.toString(result));
	}
	
	public void removeDuplicates(String str) {
		
		char[] str1 = str.toCharArray();
		char[] result = new char [str1.length];
		int index = 0;
		
		for(int i=0; i<str1.length; i++) { // pick one element
	// giving one element		
			boolean isPresent = false;
			for(int j=0; j<result.length; j++) { // search that element in the result
				
				if(str1[i] ==  result[j]) {  
					isPresent = true;
					break;
				}
				
			}
			if(! isPresent) {
				result[index] = str1[i];
				index ++;
			}
			
		}
		System.out.println("unique string" + new String(result));
		
	}
	
	public static void main(String args[]) {
		new firstOccurence().findFirstOccurence("bcfgagee");		
		new firstOccurence().findFirstOccurence("abdcdcgh");
		new firstOccurence().findFirstOccurence("geeksforgeeks");
		
		new firstOccurence().removeDuplicates("bananas");		
		new firstOccurence().removeDuplicates("geeksforgeeks");


	}

}
