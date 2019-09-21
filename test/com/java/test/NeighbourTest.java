/**
 * 
 */
package com.java.test;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.java.problems.Neighbour;

/**
 * @author m_800199
 *
 */
class NeighbourTest {

	/**
	 * Test method for
	 * {@link com.java.problems.Neighbour#main(java.lang.String[])}.
	 */
	@Test
	void testSetStates_for_oneDay() {

		// setup arrange
		int testState[] = new int[] { 1, 0, 0, 0, 0, 1, 0, 0 };

		int days = 1;

		// act
		List<Integer> resultStates = new Neighbour().setStates(testState, days);

		// assert
	//	List<Integer> expectedStates = Arrays.asList(new Integer(0), new Integer(1), new Integer(0), new Integer(0),
	//			new Integer(1), new Integer(0), new Integer(1), new Integer(0));
		int[] expectedStates = new int[] { 0, 1, 0, 0, 1, 0, 1, 0 };	

		int[] actualStates = resultStates.stream().mapToInt(Integer::intValue).toArray();
		assertArrayEquals(expectedStates, actualStates);

	}
	
	@Test
	void testSetStates_for_2Day() {

		// setup arrange
		int testState[] = new int[] { 1, 1, 1, 0, 1, 1, 1, 1 };
		int days = 2;

		// act
		List<Integer> resultStates = new Neighbour().setStates(testState, days);

		// assert
	//	List<Integer> expectedStates = Arrays.asList(new Integer(0), new Integer(1), new Integer(0), new Integer(0),
	//			new Integer(1), new Integer(0), new Integer(1), new Integer(0));
		int[] expectedStates = new int[] { 0, 0, 0, 0, 0, 1, 1, 0 };		
		int[] actualStates = resultStates.stream().mapToInt(Integer::intValue).toArray();
		assertArrayEquals(expectedStates, actualStates);

	}

}
