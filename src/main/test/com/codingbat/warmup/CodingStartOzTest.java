package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class CodingStartOzTest {
	public void Test() {
		CodingStartOz obj = new CodingStartOz();
		// assertEquals(obj.startOz("ozymandias"), "oz");
		assertEquals(obj.startOz("oz"), "oz");
		// assertEquals(obj.startOz("oxx"), "o");
	}
}
