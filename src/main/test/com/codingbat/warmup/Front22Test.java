package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test
public class Front22Test {

	public void Test() {
		Front22 front = new Front22();
		assertEquals(front.front22("kitten"), "kikittenki");
		assertEquals(front.front22("Ha"), "HaHaHa");
	}
}
