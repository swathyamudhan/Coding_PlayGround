package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class StringBitsTest {
	public void Test() {
		StringBits obj = new StringBits();
		assertEquals(obj.stringBits("Hello"), "Hlo");
		assertEquals(obj.stringBits("Hi"), "H");
		assertEquals(obj.stringBits("Heeololeo"), "Hello");
	}
}
