package com.codingbat.warmup;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/*
 * tests for the class PositiveNegative
 */

@Test
public class PositiveNegativeTest {

	public void posNegTest() {
		PositiveNegative obj = new PositiveNegative();
		assertEquals(obj.posNeg(1, -1, false), false);
		assertEquals(obj.posNeg(-1, 1, false), true);
		assertEquals(obj.posNeg(-4, 5, true), false);
	}
}
