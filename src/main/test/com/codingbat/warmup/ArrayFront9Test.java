package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class ArrayFront9Test {
	public void Test() {
		ArrayFront9 obj = new ArrayFront9();
		assertEquals(obj.arrayFront9(new int[] { 1, 2, 9 }), true);
		// assertEquals(obj.last2("xaxxaxaxx"), 1);
		// assertEquals(obj.last2("axxxaaxx"), 2);
	}
}
