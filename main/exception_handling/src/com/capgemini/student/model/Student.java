package com.capgemini.student.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.exception.AgeNotWithinRangeException;
import com.capgemini.exception.NameNotValidException;

public class Student {
	
	private int rollNo;
	private String name;
	private int age;
	private String course;
	
	
	public Student() {
		super();
		
	}




	public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException ,NameNotValidException {
		super();
		
		if((age>=21) && (age<=15))
		{
			System.out.println("age is not in range");

		}
		else
			throw new AgeNotWithinRangeException();
		
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.course = course;
	}


	public static boolean validateLetters(String txt) {

	    String regx = "[a-zA-Z]+\\.?";
	    Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(txt);
	    return matcher.find();

	}


	public int getRollNo() {
		return rollNo;
	}




	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAge() {
		return age;
		}




	public void setAge(int age) {
		this.age = age;
	}




	public String getCourse() {
		return course;
	}




	public void setCourse(String course) {
		this.course = course;
	}


}
