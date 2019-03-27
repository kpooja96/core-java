package com.capgemini.employee.model;

public class Manager extends Employee {
	
	private  double PetrolAllowance;
	   private  double FoodAllowance;
	   private double OtherAllowance;
	
	public Manager() {
	 	super();
	   
	   
	 }

	public Manager(double petrolAllowance, double foodAllowance, double otherAllowance) {
		super();
		PetrolAllowance = petrolAllowance;
		FoodAllowance = foodAllowance;
		OtherAllowance = otherAllowance;
	}
	
	public void ManagerGrossSalary() {
		double basicSalary = 0;
		PetrolAllowance = (8 *basicSalary)/100;
		FoodAllowance = (13 *basicSalary)/100;
		OtherAllowance = (3 *basicSalary)/100;
	}
		
		
	

	@Override
	public double getGrossSalary() {
		
		double basicSalary = 0;
		PetrolAllowance = (8 *basicSalary)/100;
		FoodAllowance = (13 *basicSalary)/100;
		OtherAllowance = (3 *basicSalary)/100;
		double MAnagerGrrossSalary=super.getGrossSalary()+PetrolAllowance+FoodAllowance+OtherAllowance;
				return super.getGrossSalary();
	}

	@Override
	public double getNetSalary() {
		
		double PT=200;
		double PF= (getBasicSalary()*12)/100;
		double ManagerNetSalary=getGrossSalary()-(PT+PF);
		
		return super.getNetSalary();
	}

	
	}
