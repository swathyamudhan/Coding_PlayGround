package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class max1020Test {
	public void Test() {
		Max1020 obj = new Max1020();
		assertEquals(obj.max1020(11, 19), 19);
		assertEquals(obj.max1020(19, 11), 19);
		assertEquals(obj.max1020(11, 9), 11);
	}
}
