package com.capgemini.student.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.exception.InvalidDayException;
import com.capgemini.exception.InvalidMonthException;
import com.capgemini.student.model.MyDate;
import com.capgemini.student.model.Student;

public class MyDateTest {


	@Test(expected =InvalidDayException.class)
	public void throws_InvalidDayException() throws InvalidDayException,InvalidMonthException {
		
		MyDate md=new MyDate(42,8,2018);
		
	}
	
	

	@Test(expected =InvalidMonthException.class)
	public void testObjectInitialisationForMonth() throws InvalidDayException,InvalidMonthException {
		
		MyDate md=new MyDate(4,18,2018);
	}
		
		@Test
		public void testObjectInitialisationForInvalidInputs() throws InvalidDayException,InvalidMonthException {
			
			MyDate md=new MyDate(5,18,2018);
			assertEquals(5, md.getDay());
		
		
	}


}
