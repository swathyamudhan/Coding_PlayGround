package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test
public class IntMaxTest {
	public void Test() {
		IntMax obj = new IntMax();
		assertEquals(obj.intMax(1, 2, 3), 3);
		assertEquals(obj.intMax(1, 3, 2), 3);
		assertEquals(obj.intMax(3, 2, 1), 3);
	}
}
