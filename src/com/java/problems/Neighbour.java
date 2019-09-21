/**
 * 
 */
package com.java.problems;

import java.util.ArrayList;
import java.util.Arrays;
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
		List<Integer> newState = null;
		
		int[] tmpstates= new int[states.length];
		
		while(days > 0)
		{		
			newState = new ArrayList<>();
			for(int index = 0; index < states.length; index++) 
			{
				int leftN = 0;
				int rightN = 0;
				
				if(index - 1 >= 0)
				{
					leftN = states[index-1];
				}
				if((index + 1) <= (states.length - 1))
				{
					rightN = states[index + 1];
				}
				int state = leftN == rightN ? 0: 1;
				tmpstates[index] = state;
				newState.add(tmpstates[index]);
			}
			
			states = Arrays.copyOf(tmpstates, tmpstates.length);
			/*for(int i=0; i < tmpstates.length; i++) {
				states[i] = tmpstates[i];
			}*/
			days--;
		}
		return newState;
	}

}
