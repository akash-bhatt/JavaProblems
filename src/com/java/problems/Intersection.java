package com.java.problems;

import java.util.Arrays;

public class Intersection {
	
	public void findIntersection(int[] num1, int[] num2) {
		int[] intersection = new int[num1.length];
		for(int i =0; i<num1.length; i++) {
			for(int j=0; j<num2.length; j++) {
				if(num1[i] == num2[j]) {
					intersection[i] = num1[i];
				}
			}
		}
		
		Arrays.stream(intersection).forEach(System.out::print);
		
		
	}
	
	public static void main (String args[]) {
		
		new Intersection().findIntersection(new int[] {21,34,41,22,35} , new int [] {61, 34, 45, 21, 11});
	}

}
