package com.capgemini.employee.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.Employee;
import com.capgemini.employee.model.Manager;

public class ManagerTest {
	
	@Before
	public void setUp(){
	Manager	m= new Manager(4000,3000,2000);
	}
	
	
	
	
	@Test
	public void testManagerobjectCreatedWithDefaultConstructor() {
		
		Manager m=new Manager();
		assertEquals(0.0,m.getGrossSalary(),0.01);
	}
	
	@Test
	public void testManagerobjectCreatedWithDefaultConstructor1() {
		
		Manager m=new Manager();
		assertEquals(-200,m.getNetSalary(),0.01);
	}

}