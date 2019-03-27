package com.capgemini.employee.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import org.junit.Before;
import org.junit.Test;

import com.capgemini.employee.model.Employee;


public class EmployeeTest {

	private Employee emp;
	
	@Before
	public void setUp(){
		emp = new Employee(101,"John Don",20000,1000);
	}

	
	@Test
	public void testEmployeeobjectCreatedWithDefaultConstructor() {
		
		Employee emp=new Employee();
		assertNotNull(emp);
		
	}
	
	@Test
	public void testEmployeeobjectCreatedWithParameterisedConstructor() {
		
		Employee emp=new Employee(101,"John Don",20000,1000);
		assertNotNull(emp);
		assertEquals(101, emp.getEmployeeId());
		assertEquals("John Don", emp.getEmployeeName());
		assertEquals(20000, emp.getBasicSalary(),0.01);
		assertEquals(1000, emp.getMedical(),0.01);
		
			
	
	}
	
	

	@Test
	public void testEmployeeGrossSalary() {
		emp.getGrossSalary();
		assertEquals(31000, emp.getGrossSalary(),0.01);
	}
	

	@Test
	public void testEmployeeNetSalary() {
		emp.getNetSalary();
		assertEquals(28400, emp.getNetSalary(),0.01);
	}
}
	
	
	

	