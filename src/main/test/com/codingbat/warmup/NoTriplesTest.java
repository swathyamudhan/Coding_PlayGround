package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class NoTriplesTest {
	public void Test() {
		NoTriples obj = new NoTriples();
		assertEquals(obj.noTriples(new int[] { 1, 1, 2, 2, 1 }), true);
		assertEquals(obj.noTriples(new int[] { 1, 1, 2, 2, 2, 1 }), false);
	}
}
