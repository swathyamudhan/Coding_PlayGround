package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class IcyHotTest {
	public void Test() {
		IcyHot obj = new IcyHot();
		assertEquals(obj.icyHot(2, 120), false);
		assertEquals(obj.icyHot(120, -1), true);
		assertEquals(obj.icyHot(-120, 1), true);
	}
}
