/**
 * 
 */
package com.java.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author m_800199
 *
 */
public class Neighbour {
	
	/**
	 * 
	 * @param args
	 */
			
	public static void main(String [] args) {
		
		int testState[] = new int[] {1,0,0,0,0,1,0,0};
		new Neighbour().setStates(testState, 1).forEach(System.out::print);
		
	}
	
	/**
	 * 
	 * @param states
	 * @param days
	 * @return
	 */
	public List<Integer> setStates(int[] states, int days)
	{
		List<Integer> newState = new ArrayList<>();
		while(days > 0)
		{
			int leftN = 0;
			int rightN = 0;
			for(int index = 0; index < states.length; index++) 
			{
				if(index - 1 >= 0)
				{
					leftN = states[index-1];
				}
				if((index + 1) <= (states.length - 1))
				{
					rightN = states[index + 1];
				}
				int state = leftN == rightN ? 0: 1;
				newState.add(state);
			}
			days--;
		}
		return newState;
	}

}
