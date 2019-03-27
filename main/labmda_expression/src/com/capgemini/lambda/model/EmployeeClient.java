package com.capgemini.lambda.model;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeClient {
	public static void main(String[] args) {

		Comparator<Employee> c = new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				
				return Integer.compare(e1.getEmployee(), e2.getEmployee());
			}
			
		};
	
		
		
		TreeSet<Employee> employees = new TreeSet<>(c);
		employees.add(new Employee(101, "Anna", "HR", 32000));
		employees.add(new Employee(102, "Alex", "Admin", 31000));
		employees.add(new Employee(103, "Taylor", "HR", 30000));
		employees.add(new Employee(104, "Grant", "Admin", 40000));
      for(Employee employee:employees)
    	  System.out.println(employee);
	}

}
