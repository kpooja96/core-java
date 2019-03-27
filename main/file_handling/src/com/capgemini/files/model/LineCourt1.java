package com.capgemini.files.model;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineCourt1 {

	public static void main(String[] args) {

		{

			try {

				File file = new File("test.txt");

				if (file.exists()) {

					FileReader fr = new FileReader(file);
					LineNumberReader lnr = new LineNumberReader(fr);

					int linenumber = 0;

					while (lnr.readLine() != null) {
						linenumber++;
					}

					System.out.println("lines in file : " + linenumber);

					lnr.close();

				} else {
					System.out.println("File not found!");
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	public Object getline() {
		// TODO Auto-generated method stub
		return null;
	}

}