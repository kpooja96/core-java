package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandleDemo {

	public static void main(String[] args) throws IOException {

		/*
		 * File file=new File("C:\\PoojaK\\js-assignments");
		 * System.out.println(file.exists());
		 * 
		 * File folder=new File("C:\\PoojaK\\"); System.out.println(folder.exists());
		 */

		File file = new File("test.txt");

		if (!file.exists()) {
			file.createNewFile();
			System.out.println("file is created succcessfully..");
		}

		// FileWriter writer=new FileWriter(file);
		// BufferedWriter writer= new BufferedWriter(new FileWriter(file));
/*
		PrintWriter writer = (new FileWriter(file,true);
		writer.write("hello..\n");

		writer.write("how are u??\n");
		writer.write("Bye \n");

		writer.close();

		System.out.println("content has been written successfully..");
*/
	
	/*
	FileReader reader =  new FileReader("C:\\PoojaK\\assignments\\src\\main\\bank_app\\src\\com\\capgemini\\bankapp\\model\\Bank.java");
	BufferedReader bReader = new BufferedReader(reader);
	
	PrintWriter writer= new PrintWriter("Bank.java");
	String content;
	
	while((content = bReader.readLine())!=null) {
		//System.out.println(content);
		writer.println(content);

	
}
	System.out.println("success");
	writer.close();
	bReader.close();
	reader.close();
	
	
	
	}
*/
		
		
		/*
		File windowsDirectory = new File("c:\\windows");
		System.out.println(windowsDirectory.isDirectory());
		String content[] = windowsDirectory.list();
		
		for(String s:content) {
			System.out.println(s);
			*/
		
	
	File newDir = new File("myDir");
	if(!newDir.exists()) {
		newDir.mkdir();
		System.out.println("Folder is created successfully..");
	}
	
	File file1  = new File(newDir,"myfile.txt");
	if(!file1.exists()) 
		file1.createNewFile();
		System.out.println("file is successfully created");
	}
	
	
	
	}
	


	
	







