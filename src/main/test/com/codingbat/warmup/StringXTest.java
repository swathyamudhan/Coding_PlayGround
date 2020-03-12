package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class StringXTest {
	public void Test() {
		StringX frt = new StringX();
		assertEquals(frt.stringX("x"), "x");
		// assertEquals(frt.stringX("abxxxcd"), "abcd");
	}
}
