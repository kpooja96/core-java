package com.capgemini.employee.model;

public class Employee {
	
	
	private int EmployeeId;
	private String EmployeeName;
	private double BasicSalary;
	private double medical;
	
	
	public Employee() {
		super();
		
	}


	public Employee(int employeeId, String employeeName, double basicSalary, double medical) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		BasicSalary = basicSalary;
		this.medical = medical;
	}


	public int getEmployeeId() {
		return EmployeeId;
	}


	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}


	public String getEmployeeName() {
		return EmployeeName;
	}


	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}


	public double getBasicSalary() {
		return BasicSalary;
	}


	public void setBasicSalary(double basicSalary) {
		BasicSalary = basicSalary;
	}


	public double getMedical() {
		return medical;
	}


	public void setMedical(double medical) {
		this.medical = medical;
	}
	
	
	public double getGrossSalary() {
		
		double HRA =(50 *BasicSalary)/100;
				
		double GrossSalary = (BasicSalary+HRA+medical);
		
		return GrossSalary;
		
		
	}
	
	
	public double getNetSalary() {
		
		double PT=200;
		double PF = (12*BasicSalary)/100;
		double NetSalary = (getGrossSalary() - (PT+PF));
		return NetSalary;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj ==null)
			return false;
		if(!(obj instanceof Employee))
			return false;
		if(obj==this)
			return true;
		return false;
		
	
	}
	

}
