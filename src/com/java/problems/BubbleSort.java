package com.java.problems;

import java.util.Arrays;

public class BubbleSort {

	public void sort(int[] input) {
		int index = 0;
		int tmp = 0;
		int[] result = new int[input.length];
		boolean sort = true;

		for (int count = 1; count < input.length; count++) {
			for (int i = 0; i < input.length - (count); i++) {
				if (input[i] > input[i + 1]) {
					tmp = input[i + 1];
					input[i + 1] = input[i];
					input[i] = tmp;
				}
			}
		}

		Arrays.stream(input).forEach(System.out::print);
	}

	public static void main(String[] args) {
		int[] num = { 5, 2, 3, 4, 1 };
	//	int[] num = { 2, 8, 3, 10, 4 };

		new BubbleSort().sort(num);

	}

}
