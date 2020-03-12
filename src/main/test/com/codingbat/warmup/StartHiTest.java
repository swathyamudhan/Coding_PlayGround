package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class StartHiTest {

	public void Test() {
		StartHi obj = new StartHi();
		assertEquals(obj.startHi("hi ho"), true);
		assertEquals(obj.startHi("hi"), true);
		assertEquals(obj.startHi("h"), false);
	}
}
