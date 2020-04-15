package com.codingbat.array3;

import static org.testng.Assert.assertEquals;

public class LinearInTest {
	@org.testng.annotations.Test
	public void Test() {
		LinearIn ln = new LinearIn();
		assertEquals(ln.linearIn(new int[] { 1, 2, 4, 4, 6 }, new int[] { 2, 4 }), true);
	}
}
