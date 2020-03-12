package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class Array667Test {
	public void Test() {
		Array667 obj = new Array667();
		assertEquals(obj.array667(new int[] { 6, 6, 2 }), 1);
		// assertEquals(obj.last2("xaxxaxaxx"), 1);
		// assertEquals(obj.last2("axxxaaxx"), 2);
	}
}
