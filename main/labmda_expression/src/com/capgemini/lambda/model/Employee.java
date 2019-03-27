package com.capgemini.lambda.model;

import java.util.Objects;

public class Employee {

	private int empId;
	private String name;
	private String empDpt;
	private double salary;

	public Employee() {
		super();

	}

	public Employee(int empId, String name, String empDpt, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.empDpt = empDpt;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", empDpt=" + empDpt + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Employee))
			return false;
		if (obj == this)
			return true;
		Employee employee = (Employee) obj;
		if (this.empId == employee.empId && this.name == employee.name)
			return true;
		else
			return false;

	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, name);

	}

	public int getEmployee1() {
		
		return 0;
	}

	public int getEmployee() {
		
		return 0;
	}

	


}
