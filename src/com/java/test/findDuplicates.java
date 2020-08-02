package com.java.test;

import java.util.Arrays;

public class findDuplicates {
	
	public void findDuplicateValues(int[] arr) {
		
		int counter = 0;
		boolean isPresent = false;
		int[] result = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					isPresent = true;
					break;
				}
				
				if(isPresent) {
					result[i] = arr[i];
				}
			}
			
		}
		
		Arrays.stream(result).forEach(System.out::print);
		
	}
	
	public static void main (String args[]) {
		new findDuplicates().findDuplicateValues(new int[] {5,6,8,10,20,5,7,8,2,6});
	}

}
