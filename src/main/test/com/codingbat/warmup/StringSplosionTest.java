package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test
public class StringSplosionTest {
	public void StringTesting() {
		StringSplosion input = new StringSplosion();
		assertEquals(input.stringSplosion("Code"), "CCoCodCode");
		assertEquals(input.stringSplosion("abc"), "aababc");
		assertEquals(input.stringSplosion("ab"), "aab");
	}
}
