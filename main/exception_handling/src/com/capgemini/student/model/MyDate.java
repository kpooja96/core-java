package com.capgemini.student.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.exception.InvalidDayException;
import com.capgemini.exception.InvalidMonthException;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	
	public MyDate() {
		super();
		
	}
 static MyDate d= new MyDate();

	public MyDate(int day, int month, int year) throws InvalidDayException,InvalidMonthException {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public static boolean isValidate(double month) {

	    String regx = "^(1[0-2]0[1-9]/(3[01]"
	    				+"|[12][0-9]0[1-9]/[0-9] {4}$";
	    Pattern pattern = Pattern.compile(regx);
	    Matcher matcher = pattern.matcher((CharSequence)d);
	    return matcher.matches();
	    
	   
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static MyDate getD() {
		return d;
	}

	public static void setD(MyDate d) {
		MyDate.d = d;
	}
}
