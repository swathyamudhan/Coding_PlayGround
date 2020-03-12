package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class StringETest {
	public void Test() {
		StringE obj = new StringE();
		// assertEquals(obj.stringE("Hello"), true);
		// assertEquals(obj.stringE("Heelle"), true);
		assertEquals(obj.stringE("Hll"), false);
	}
}
