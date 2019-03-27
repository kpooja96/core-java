package com.capgemini.student.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.student.model.Student;

public class StudentTest {

	
	
	@Test
	public void age_throws_AgeNotWithinRangeException_between_15_and_21() {
		
		Student stud=new Student();
		assertNotNull(stud);
		
	}
	
	

	@Test
	public void age_throws_AgeWithinRangeException_between_15_and_21() {
		
		Student stud=new Student();
		assertNotNull(stud);
		
	}
	

	@Test
	public void age_throws_NameNotValidException() {
	
		Student stud=new Student();
		
	}
}


