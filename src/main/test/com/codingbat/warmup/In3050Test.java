package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class In3050Test {
	public void Test() {
		In3050 obj = new In3050();
		assertEquals(obj.in3050(30, 31), true);
		assertEquals(obj.in3050(30, 41), false);
		assertEquals(obj.in3050(40, 50), true);
	}
}
