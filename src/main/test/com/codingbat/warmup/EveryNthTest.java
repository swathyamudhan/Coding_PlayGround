package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class EveryNthTest {
	public void Test() {
		EveryNth frt = new EveryNth();
		assertEquals(frt.everyNth("Miracle", 2), "Mrce");
		assertEquals(frt.everyNth("abcdefg", 2), "aceg");
		assertEquals(frt.everyNth("abcdefg", 3), "adg");

	}
}
