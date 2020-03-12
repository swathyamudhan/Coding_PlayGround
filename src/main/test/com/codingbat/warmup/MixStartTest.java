package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class MixStartTest {
	public void Test() {
		MixStart obj = new MixStart();
		// assertEquals(obj.mixStart("mix snacks"), true);
		// assertEquals(obj.mixStart("pix snacks"), true);
		assertEquals(obj.mixStart("piz snacks"), false);
	}
}
