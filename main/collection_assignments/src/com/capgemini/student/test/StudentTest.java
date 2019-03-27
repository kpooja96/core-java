package com.capgemini.student.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.student.model.Student;

public class StudentTest {

	private static Student neha; 
	private static Student pratiksha; 
	private static Student manasi;
	
	@Before
	public void setUp() {
		neha = new Student("neha",101,450);
		pratiksha = new Student("pratiksha",102,400);
		manasi = new Student("manasi",105,550);
	}
	
	
	@Test
	public void testStudent() {
		ArrayList<Student> s = new ArrayList<>();
		s.add(neha);
		s.add(pratiksha);
		s.add(manasi);
	
		Iterator<Student> iterator = s.iterator();
		assertEquals(neha, iterator.next());
		assertEquals(pratiksha, iterator.next());
		assertEquals(manasi, iterator.next());
	
	}
	
	@Test
	 public void testStudentcomp() {
		
		TreeSet <Student> se = new TreeSet<>();
		se.add(neha);
		se.add(pratiksha);
		se.add(manasi);
		
		Iterator<Student> iterator = se.iterator();
		assertEquals(manasi, iterator.next());
		assertEquals(neha, iterator.next());
		assertEquals(pratiksha, iterator.next());
	}
	
	@Test
	 public void testStudentcomp1() {
		
		HashMap <String,String> st = new HashMap<>();
	    st.put(neha.getName(),"apple");
	    st.put(pratiksha.getName(),"mango");
	    st.put(manasi.getName(),"orange");
	    

		
	}
	
}
