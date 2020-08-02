package com.java.problems;

import java.util.Arrays;
import java.util.List;

public class ConsecutiveList {
	
	public boolean isConsecutive (int[] num) {
		
		boolean isConsecutive = false;
		int tmp = 0;
		int[] sortedArray = new int[num.length];
		
		// sort in ascending order
		for (int i=1; i<num.length; i++) {
			for (int j=0; j<(num.length-i); j++) {
				
				if(num[j] > num[j+1]) {
					 tmp = num[j];
					 num[j] = num[j+1];
					 num[j+1] = tmp;
				}
			}
		}
		
		//Collection Sort
		//Arrays.sort(num);
		
		Arrays.stream(num).forEach(System.out::print);
		
		//subtract consecutive numbers and if result = 1 return true
		
		for(int i=0; i<(num.length-1); i++) {
			if(num[i+1] - num[i] == 1) {
				isConsecutive = true;
			}else {
				isConsecutive = false;
				break;
			}
		}
		
		return isConsecutive;

	}
	
	public static void main (String args[]) {
		
		System.out.println(new ConsecutiveList().isConsecutive(new int[] {5,1,4,3,2}));
		
		System.out.println(new ConsecutiveList().isConsecutive(new int[] {5,1,4,3,2,8}));

		System.out.println(new ConsecutiveList().isConsecutive(new int[] {5,6,7,8,9,9}));

	}

}
