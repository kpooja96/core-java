package com.capgemini.files.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.files.model.FileExist1;
import com.capgemini.files.model.WordCount;

public class WordcntTest {
	@Test
	public void testCount() {
		WordCount word = new WordCount();
		
		String input = "Election";
		int expected = 2;
		int actual = count_e(input);
		assertEqual("There are many e's in the String.", expected, actual);
	}

	private void assertEqual(String string, int expected, int actual) {

	}

	private int count_e(String input) {

		return 0;
	}

	@Test
	public void testforFileExist() {

		FileExist1 fileExist = new FileExist1();
		assertEquals(null, fileExist.checkFileExist());
	}
}
