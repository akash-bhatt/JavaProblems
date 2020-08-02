package com.java.test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.java.problems.Anagram;

public class AnagramTest {
	
	@Test
	public void isAnagramTest() {
		//set up
		String firstString = "hello";
		String secondString = "lleHo";
		
		//act
		boolean expectedResult = new Anagram().isAnagram(firstString, secondString);
		
		//asset
		assertTrue(expectedResult);

				
	}

}
