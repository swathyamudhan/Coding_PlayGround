package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class StringTimesTest {
	public void Test() {
		StringTimes frt = new StringTimes();
		assertEquals(frt.stringTimes("Hi", 2), "HiHi");
		assertEquals(frt.stringTimes("Hi", 3), "HiHiHi");
		assertEquals(frt.stringTimes("Hi", 1), "Hi");

	}
}
