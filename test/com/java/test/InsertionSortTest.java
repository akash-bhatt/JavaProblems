package com.java.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.java.problems.InsertionSort;

public class InsertionSortTest {

	@Test
	void testInsertionSort() {
		
		//setup
		int [] input = {13, 25, 2, 99, 79};
		
		int [] expected = {2, 13, 25, 79, 99};
		
		//act
		int [] result = InsertionSort.insertionSort(input);
		
		//assert
		Assertions.assertArrayEquals(expected, result);
	}
}
