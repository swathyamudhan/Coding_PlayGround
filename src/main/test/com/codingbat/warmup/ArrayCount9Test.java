package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test
public class ArrayCount9Test {
	public void Test() {
		ArrayCount9 obj = new ArrayCount9();
		assertEquals(obj.arrayCount9(new int[] { 1, 2, 9 }), 1);
		// assertEquals(obj.last2("xaxxaxaxx"), 1);
		// assertEquals(obj.last2("axxxaaxx"), 2);
	}
}
