package com.java.problems;

import java.util.Arrays;

public class BinarySearch {

	public void findIndex(int[] input, int n, int L, int R) {
		
		Arrays.sort(input);
		
		int mid = input.length -1;

		for (int i=0; i<mid; i--) {
			if(input[mid] == n) {
				System.out.println("Index of n is::" +input[mid]);
				break;
			}
			else{
				if(input[mid] > n) {
					L = input[mid];
					mid = Math.floorDiv((R-L), 2);
				}
				
			}
		}
	}
	
	public static void main (String args[]) {
		int[] input = {2,3,5,6,7};
		new BinarySearch().findIndex(input, 3, 0, input.length-(1));
	}
}
