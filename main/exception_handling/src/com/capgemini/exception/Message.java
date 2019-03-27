package com.capgemini.exception;

public class Message {

	private String message;
	
	public Message(String message){
	      this.message = message; 
	   }
	
	
	public void printMessage(){
	      System.out.println(message);
	      int a = 0;
	      int b = 1/a;
	   }
}
