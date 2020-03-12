package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class Last2Test {
	public void Test() {
		Last2 obj = new Last2();
		assertEquals(obj.last2("xxxx"), 2);
		// assertEquals(obj.last2("xaxxaxaxx"), 1);
		// assertEquals(obj.last2("axxxaaxx"), 2);
	}
}
