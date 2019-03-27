package com.capgemini.employee.model;

public class MarketingExecutive extends Employee {
	
	private int kilometres;
	private int tourAllowance;
	private int telephoneAllowance;
	

	public MarketingExecutive() {
	 	super();
	}


	public MarketingExecutive(int kilometres, int tourAllowance, int telephoneAllowance) {
		super();
		this.kilometres = kilometres;
		this.tourAllowance = tourAllowance;
		this.telephoneAllowance = telephoneAllowance;
	}


	@Override
	public double getGrossSalary() {
		
		int kilometre = 50;
		tourAllowance = (5 *kilometre);
		telephoneAllowance = (1500 +kilometre);
		
		return super.getGrossSalary();
	}


	@Override
	public double getNetSalary() {
		
		return super.getNetSalary();
	}
	
	
	
	
	
	

}
