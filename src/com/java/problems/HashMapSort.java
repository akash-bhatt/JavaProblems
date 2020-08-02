package com.java.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class HashMapSort {

	public void sortHashMap() {
		Map<String, Integer> employee = new HashMap<>();

		employee.put("Deepa", 31);
		employee.put("Akash", 36);
		employee.put("Badri", 37);
		employee.put("Pradeep", 32);
		employee.put("Harshita", 25);

		TreeMap<String, Integer> sortEmployee = new TreeMap<>();
		sortEmployee.putAll(employee);
		
		System.out.println("Sorted Mapy by Key is:: " + sortEmployee);
		
	      LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
	      ArrayList<Integer> list = new ArrayList<>();

		
		for (Map.Entry<String, Integer> entry : employee.entrySet()) {
	         list.add(entry.getValue());
	      }
		
	      Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
	      });

			
	      for (int value : list) {
	         for (Entry<String, Integer> entry : employee.entrySet()) {
	            if (entry.getValue().equals(value)) {
	               sortedMap.put(entry.getKey(), value);
	            }
	         }
	      }
	      
	      System.out.println("Sorted Map by value is" +sortedMap);
	      
	   }

	public static void main(String args[]) {
		new HashMapSort().sortHashMap();

	}

}
