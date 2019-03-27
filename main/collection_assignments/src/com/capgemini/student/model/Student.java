package com.capgemini.student.model;

import java.util.Objects;

import com.capgemini.car.model.Car;

public class Student implements Comparable<Student>{
	
	private String name;
	private int rollNo;
	private int marks;
	
	public Student() {
		super();
		
	}

	public Student(String name, int rollNo, int marks) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if(this.name==other.name)
			return true;
		return false;
	}

	@Override
	public int compareTo(Student student) {
		
		return (this.name.compareTo(student.name));
	}
	

	
	
	
	

}
