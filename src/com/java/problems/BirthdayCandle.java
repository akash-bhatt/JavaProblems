package com.java.problems;

public class BirthdayCandle {
	
	public void birthdayCakeCandles(int age, int[] candleHeight) {
		
		int max=0;
		int maxCount = 0;
		// find out the max  - 1 3 5 4 5
		for (int i =0; i<candleHeight.length; i++) {
			if(candleHeight[i] > max)
				max = candleHeight[i];
		}
		
		System.out.println("Max height  of candles  :: " + max);

		// find out the count of max number
		
		for(int j=0; j<candleHeight.length; j++) {
			if(max == candleHeight[j])
				maxCount ++;
		}
		
		System.out.println("Number of candles blow out :: " + maxCount);
	}
	
	public static void main(String args[]) {
		new BirthdayCandle().birthdayCakeCandles(5, new int[] {1, 3, 5, 4, 5});
	}

}
