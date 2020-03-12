package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class HasTeenTest {
	public void Test() {
		HasTeen obj = new HasTeen();
		assertEquals(obj.hasTeen(13, 20, 10), true);
		assertEquals(obj.hasTeen(20, 19, 10), true);
		assertEquals(obj.hasTeen(20, 10, 13), true);
	}
}
