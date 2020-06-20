package com.java.problems;

public class InsertionSort {

	public static int[] insertionSort(int[] input) {
		
		// {13, 25, 2, 99, 79};

		for (int i = 1; i < input.length; i++) {

			for (int j = i; j >= 1; j--) {

				if (input[j-1] > input[j]) {
					int swap = input[j - 1];
					input[j - 1] = input[j];
					input[j] = swap;
				}
			}

		}

		return input;
	}

}
