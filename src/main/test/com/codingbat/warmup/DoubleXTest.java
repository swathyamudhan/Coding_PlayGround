package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test
public class DoubleXTest {
	public void Test() {
		DoubleX front = new DoubleX();
		assertEquals(front.doubleX("axxbb"), true);
		assertEquals(front.doubleX("axaxax"), false);
		assertEquals(front.doubleX("xxxxx"), true);
	}
}
