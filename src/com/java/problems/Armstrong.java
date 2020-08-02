package com.java.problems;

public class Armstrong {
	
	public boolean isArmstrong(int num) {
		
		boolean isArmstrong = false;
		
		int val = Math.floorDiv(num, 3);
				
			if(val * 3 == num) {
				isArmstrong = true;
			}
		return isArmstrong;
	}
	
	public static void main (String args[]) {
		
		int input = 153;
		System.out.println("is Armstrong :: " + new Armstrong().isArmstrong(input));
	}

}
