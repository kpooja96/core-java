package com.capgemini.exception;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;


class MessageTest {

	 String message = "Robert";	
	   Message mes = new Message(message);
	
	   
	   @Test(expected = ArithmeticException.class)
	   public void testPrintMessage() {	
	      System.out.println("Inside testPrintMessage()");     
	      mes.printMessage();     
	   }
	}


