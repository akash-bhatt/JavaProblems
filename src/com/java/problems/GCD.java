/**
 * 
 */
package com.java.problems;

import java.util.Arrays;

/**
 * @author m_800199
 *
 */
public class GCD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr[] = new int[] {2,3,4,8,6};
		int num = 5;
		System.out.println(new GCD().getGCD(arr, num));

	}
	
	/**
	 * 
	 * @param arr
	 * @param num
	 * @return
	 */
	public int getGCD(int[] arr, int num) {
		
		int max = Arrays.stream(arr).max().getAsInt();
		
		int i =1;
		int result = 0;
		while (i <= max) {
			int counter = 0;
			for( int index=0; index<arr.length; index++)
			{
				int val = Math.floorMod(arr[index], i);
				if(val == 0 ) {
					counter++;
					continue;
				}
				break;
			}
			if(counter == arr.length) {
				result = i;
			}
			i++;
		}
		
		return result;
	}

}
