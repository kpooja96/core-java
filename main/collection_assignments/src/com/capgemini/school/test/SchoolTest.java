package com.capgemini.school.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.school.model.School;


public class SchoolTest {

	private static School JSPM;
	private static School hutchings;
	private static School mountst;

	@BeforeClass
	public static void setUp() {

		JSPM = new School("JSPM", "Wakad", "Pune", 2);
		hutchings = new School("hutchings", "Airoli", "Mumbai", 1);
		mountst = new School("mountst", "Kothrud", "Pune", 1);
	}

	@Test
	public void testSchool() {
		ArrayList<School> sc = new ArrayList<>();
		sc.add(JSPM);
		sc.add(hutchings);
		sc.add(mountst);

		Iterator<School> iterator = sc.iterator();
		assertEquals(JSPM, iterator.next());
		assertEquals(hutchings, iterator.next());
		assertEquals(mountst, iterator.next());
	}

	@Test
	public void testSchoolDups() {
		HashSet<School> s = new HashSet<>();
		s.add(JSPM);
		s.add(hutchings);
		s.add(mountst);
		assertEquals(3, s.size());

	}
}
