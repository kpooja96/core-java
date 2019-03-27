package com.capgemini.files.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.capgemini.files.model.BankAccount;
import com.capgemini.files.model.DebitCard;

public class SerializationDemo {
	public static void main(String[] args) throws IOException {
		   
		DebitCard debitCard = new DebitCard(45412121111111L,234,11,2021);
		BankAccount account = new BankAccount(101,"John Don","SAVING",34000,debitCard);
		
		
		//serialization process
		
		FileOutputStream fileOutputstream = new FileOutputStream("account.ser");
		ObjectOutputStream outputOutputstream = new ObjectOutputStream(fileOutputstream);

	    outputstream.writeObject(account);
	    outputstream.close();
	    
	    
	    FileInputStream fileInputstream = new FileInputStream("account.ser");
	    ObjectInputStream outputInputstream = new ObjectInputStream(fileInputstream);
	    
	    BankAccount account2 = (BankAccount)inputStream.readobject();
	    inputStream.close();
	    
	    
	   System.out.println(account2);
	}

}
