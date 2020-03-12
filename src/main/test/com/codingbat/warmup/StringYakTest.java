package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class StringYakTest {
	public void Test() {
		StringYak frt = new StringYak();
		assertEquals(frt.stringYak("yakpak"), "pak");
		// assertEquals(frt.stringX("abxxxcd"), "abcd");
	}
}
