package com.capgemini.employee.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.Manager;
import com.capgemini.employee.model.MarketingExecutive;

class MarketingExTest {

	@Before
	public void setUp(){
		MarketingExecutive	mx= new MarketingExecutive(400,300,200);
	}
	
	
	
	
	@Test
	public void testMarketingExecutiveobjectCreatedWithDefaultConstructor() {
		
		MarketingExecutive	mx= new MarketingExecutive();
		assertEquals(0.0,mx.getGrossSalary(),0.01);
		
	}
	

	@Test
	public void testMarketingExecutiveobjectCreatedWithDefaultConstructor1() {
		
		MarketingExecutive	mx= new MarketingExecutive();
		assertEquals(-200,mx.getNetSalary(),0.01);
	}
		


}

