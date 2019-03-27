package com.capgemini.files.test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.Test;

import com.capgemini.files.model.FileExist1;
import com.capgemini.files.model.Grep;

public class GrepApplicationTest {
	@Test
	public void testToCheckStringIsPresentOrNot() throws IOException {
		Grep grep = new Grep();

		TreeMap<Integer, String> map1 = grep.checkString();
		int a = 0;
		for (Entry<Integer, String> m : map1.entrySet()) {
			System.out.println(" " + m.getKey() + " " + m.getValue());
			while (map1.size() > a) {
				assertThat(m.getValue(), containsString("Java"));
			}
		}
	}

	@Test
	public void testforFileNotExist() {
		FileExist1 fileExist = new FileExist1();
		assertEquals(null, fileExist.checkFileExist());
	}

}
