package com.capgemini.cellphone.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.cellphone.model.CellPhone;
import com.capgemini.school.model.School;

public class CellPhoneTest {

	private static CellPhone redmiNote4;
	private static CellPhone onePlus;
	private static CellPhone oppo;
	
	@BeforeClass
	public static void setUp() {
		
		redmiNote4 = new CellPhone("xiomi","L1","RAM","Android",13000);
		onePlus = new CellPhone("onePlus","SG3","Camera","Android",17000);
		oppo = new CellPhone("oppo","MS5","ROM","Android",20000);
		
	}
	
	@Test
	public void testCellPhone() {
		ArrayList<CellPhone> cl = new ArrayList<>();
		cl.add(redmiNote4);
		cl.add(onePlus);
		cl.add(oppo);
		
		Iterator<CellPhone> iterator = cl.iterator();
		assertEquals(redmiNote4, iterator.next());
		assertEquals(onePlus, iterator.next());
		assertEquals(oppo, iterator.next());
	}
	
	

		@Test
		public void testCellPhoneDups() {
			HashSet<CellPhone> cll = new HashSet<>();
			cll.add(redmiNote4);
			cll.add(onePlus);
			cll.add(oppo);
			assertEquals(3, cll.size());
	}
		
	}

