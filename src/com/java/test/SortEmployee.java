package com.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployee {
	
	public static void main(String args[]) {
		Employee emp = new Employee();
		
		emp.setFirstName("Deepa");
		emp.setLastName("Kumar");
		
		Employee emp1 = new Employee();
		emp1.setFirstName("Kumar");
		emp1.setLastName("Deepa");
		
		List<Employee> EmployeeList = new ArrayList<Employee>();
		EmployeeList.add(emp);
		EmployeeList.add(emp1);
		
		//EmployeeList.stream().sorted()
		
		EmployeeList.stream().forEach(System.out::print);
		
		
	}
	
	
}
