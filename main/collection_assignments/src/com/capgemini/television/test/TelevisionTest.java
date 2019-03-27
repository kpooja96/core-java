package com.capgemini.television.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.television.model.Television;

public class TelevisionTest {

	private static Television samsung;
	private static Television onida;
	private static Television micromax;

	@BeforeClass
	public static void setUp() {
		samsung = new Television("samsung", "LED", true, 450000);
		onida = new Television("onida", "LCD", true, 65000);
		micromax = new Television("micromax", "LED", true, 25000);

	}

	@Test
	public void testTelevision() {
		ArrayList<Television> tv = new ArrayList<>();
		tv.add(samsung);
		tv.add(onida);
		tv.add(micromax);

		Iterator<Television> iterator = tv.iterator();
		assertEquals(samsung, iterator.next());
		assertEquals(onida, iterator.next());
		assertEquals(micromax, iterator.next());
	}

	@Test
	public void testTelevisionDups() {
		HashSet<Television> tvs = new HashSet<>();
		tvs.add(samsung);
		tvs.add(onida);
		tvs.add(micromax);
		assertEquals(3, tvs.size());
	}
}