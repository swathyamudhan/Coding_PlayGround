package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test
public class Close10Test {
	public void Test() {
		Close10 obj = new Close10();
		assertEquals(obj.close10(8, 13), 8);
		assertEquals(obj.close10(13, 8), 8);
		assertEquals(obj.close10(13, 7), 0);
	}
}
