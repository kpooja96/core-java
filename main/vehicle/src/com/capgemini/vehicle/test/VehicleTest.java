package com.capgemini.vehicle.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.vehicle.model.Vehicle;

public class VehicleTest {
	

	Vehicle v1;
	Vehicle v2;
	Vehicle v3;
	Vehicle v4;
	

	@Before
	public void setUp() {
		
		v1=new Vehicle(45,80,"John",0);
		v2=new Vehicle(180,60,"Danny",0);
		v3=new Vehicle(90,55,"peter",0);
		v4=new Vehicle(60,46,"Donald",0);
		
	}
	
	@Test
	public void testChangeSpeedWithValidInputs() {
		assertEquals(100, v1.changeSpeed(20));
	}
	   

	

	@Test
	public void testChangeSpeedWithZeroInputs() {
		assertEquals(100, v1.changeSpeed(0));
	}
	 
	
	@Test
	public void testStop() {
		assertEquals(0, v1.stop());
	}
	
	

	@Test
	public void testChangeDirectionWithValidInput() {
		assertEquals(45, v1.ChangeDirection(45,0));
		assertEquals(Vehicle.TURN_LEFT, v1.getTurnOption(),0.01);
	}
	
	

	@Test
	public void testChangeDirectionWithChangedInput() {
		assertEquals(45, v1.ChangeDirection(45,1));
		assertEquals(Vehicle.TURN_RIGHT, v1.getTurnOption(),0.01);
	}
	
	
	public void testVehicleTest() {
		assertEquals("80 45", v1.toString());
	}
}
