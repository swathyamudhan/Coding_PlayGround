package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class RangeIn1020Test {
	public void Test() {
		RangeIn1020 obj = new RangeIn1020();
		assertEquals(obj.in1020(12, 99), true);
		assertEquals(obj.in1020(21, 12), true);
		assertEquals(obj.in1020(8, 99), false);
	}
}
