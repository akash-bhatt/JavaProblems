package com.java.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.java.problems.GCD;

class GCDTest {

	@Test
	void testGetGCD1() {
		// setup
		int arr[] = new int[] { 2,4,6,8,10 };
		int num = 5;
		
		//act
		int actualGCD = new GCD().getGCD(arr, num);
		
		//assert
		int expectedGCD = 2;
		assertEquals(expectedGCD, actualGCD);

	}
	
	@Test
	void testGetGCD2() {
		// setup
		int arr[] = new int[] { 2,3,4,5,6 };
		int num = 5;
		
		//act
		int actualGCD = new GCD().getGCD(arr, num);
		
		//assert
		int expectedGCD = 1;
		assertEquals(expectedGCD, actualGCD);

	}

}
