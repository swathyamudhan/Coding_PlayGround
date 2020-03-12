package com.codingbat.string3;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class GHappyTest {
	@Test
	public void test() {
		GHappy obj = new GHappy();
		assertEquals(obj.gHappy("xxgggxyg"), false);
	}
}
