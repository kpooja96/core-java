package com.capgemini.tax.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import com.capgemini.tax.model.TaxCalculator;

public class TaxCalculatorTest {
	
	
	@Before
	public void setUp() {
		
	}
	
	

	@Test(expected =TaxnotException.class)
	public void throws_TaxcalciException() throws TaxnotException,TaxException {
		
		TaxCalculator tax=new TaxCalculator();
		
	}
	

	

	@Test(expected =TaxException.class)
	public void throws_TaxException() throws TaxnotException,TaxException {
		
		TaxCalculator tax=new TaxCalculator();
}
}
