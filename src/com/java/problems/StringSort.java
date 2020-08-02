package com.java.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StringSort {
	
	public void sortString(String str) {
		
		char strChar[] = str.toCharArray();
		int count =0;
		Map<String, Integer> initialMap = new HashMap<>();
	    LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		List<Integer> list = new ArrayList <Integer>();
		
		for (int i=0; i<strChar.length; i++) {
			if(initialMap.get(Character.toString(strChar[i])) != null) {
				continue;
			}
			for(int j=0; j<strChar.length; j++) {
				if(strChar[i] == strChar[j]) {
					if(initialMap.get(Character.toString(strChar[i])) == null) {
						count =1;
					}else {
						count = initialMap.get(Character.toString(strChar[i])) + 1;
					}
					initialMap.put(Character.toString(strChar[i]), count);
				}
			}
		}
		
		for (Map.Entry<String, Integer> entry : initialMap.entrySet()) {
			list.add(entry.getValue());
		}
		
		Collections.sort(list);
		
		for(int value : list)
		{
			for (Map.Entry<String, Integer> entry : initialMap.entrySet()) {
					if(entry.getValue().equals(value)) {
						sortedMap.put(entry.getKey(), value);
					}
				}
			}
	      System.out.println("Sorted Map by value is" +sortedMap);
	      
	      sortedMap.entrySet().stream().forEach(k->System.out.print(k.getKey()));
	      
		
	}
	
	public static void main(String args[]) {
		new StringSort().sortString("geeksforgeeks");

	}


}
