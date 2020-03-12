package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class CountXXTest {
	public void Test() {
		CountXX obj = new CountXX();
		assertEquals(obj.countXX("Hexxo thxxe"), 2);
		// assertEquals(obj.countXX("xxx"), 2);
		// assertEquals(obj.countXX("xxxx"), 3);
	}
}
