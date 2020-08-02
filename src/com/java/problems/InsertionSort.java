package com.java.problems;

import java.util.Arrays;

public class InsertionSort {
	
	public void insertSort(int[] input) {
		
		for(int j=1; j<input.length; j++) 
		{
			for(int i=j; i>=1; i--) {
				if(input[i] < input[i-1]) {
					int tmp = input[i];
					input[i] = input[i-1];
					input[i-1] = tmp;
				}
			}
			
		}
		
		Arrays.stream(input).forEach(System.out::print);
	}
	
	public static void main (String args[]) {
		
		//int[] num = {2,1,3,5,4};
		int[] num = {79,2,99,13,4};
		new InsertionSort().insertSort(num);
	}

}
