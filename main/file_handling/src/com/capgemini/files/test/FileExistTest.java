package com.capgemini.files.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.files.model.FileExist1;

public class FileExistTest {

	@Test
	public void testforFileExist() {

		FileExist1 fileExist = new FileExist1();
		assertEquals(null, fileExist.checkFileExist());
	}

	@Test
	public void testforFileNotExist() {
		FileExist1 fileExist = new FileExist1();
		assertEquals(null, fileExist.checkFileExist());
	}

}
