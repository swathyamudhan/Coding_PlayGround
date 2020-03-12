package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test
public class Or35Test {

	public void Test() {
		Or35 obj = new Or35();
		assertEquals(obj.or35(8), false);
		assertEquals(obj.or35(3), true);
	}
}
