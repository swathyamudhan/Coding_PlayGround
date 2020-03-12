package com.codingbat.string2;

import static org.testng.Assert.assertEquals;

public class MixStringTest {
	public void Test() {
		MixString frt = new MixString();
		assertEquals(frt.mixString("abc", "xyz"), "axbycz");
	}
}
