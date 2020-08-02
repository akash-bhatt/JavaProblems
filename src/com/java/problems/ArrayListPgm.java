package com.java.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPgm {
	
	public void printArray() {
		List <String> str = new ArrayList<String>();
		str.add("A");
		str.add("B");
		str.add("C");
		
		str.stream().forEach(System.out::println);
	}
	
	public static void main (String args[]) {
		new ArrayListPgm().printArray();
	}

}
