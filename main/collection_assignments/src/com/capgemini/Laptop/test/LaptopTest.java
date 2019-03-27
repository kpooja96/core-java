package com.capgemini.Laptop.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.Laptop.model.Laptop;

public class LaptopTest {

	private Laptop dellLaptop;
	private Laptop hpLaptop;
	private Laptop acerLaptop;

	@Before
	public void setUp() {
		dellLaptop = new Laptop("dell", "888", "windows10", "i3");
		hpLaptop = new Laptop("hp", "888", "windows8", "i5");

		acerLaptop = new Laptop("acer", "888", "ubuntu", "i3");

	}

	@Test
	public void testLaptop() {

		ArrayList<Laptop> latp = new ArrayList<>();
		latp.add(dellLaptop);
		latp.add(hpLaptop);
		latp.add(acerLaptop);
		
		Iterator<Laptop> iterator = latp.iterator();
		assertEquals(dellLaptop, iterator.next());
		assertEquals(hpLaptop, iterator.next());
		assertEquals(acerLaptop, iterator.next());

	}

	
	@Test
	
	 public void testLaptopDuplicates() {
		
		
		HashSet <Laptop> lt = new HashSet(); 
		lt.add(dellLaptop);
		lt.add(hpLaptop);
		lt.add(acerLaptop);
		
		
		Iterator<Laptop> iterator = lt.iterator();
		assertEquals(dellLaptop, iterator.next());
		assertEquals(hpLaptop, iterator.next());
		assertEquals(acerLaptop, iterator.next());
		
		}
}
