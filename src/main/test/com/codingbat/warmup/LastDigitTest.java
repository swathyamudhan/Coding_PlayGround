package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class LastDigitTest {
	public void Test() {
		LastDigit obj = new LastDigit();
		assertEquals(obj.lastDigit(7, 17), true);
		assertEquals(obj.lastDigit(6, 17), false);
		assertEquals(obj.lastDigit(3, 113), true);
	}
}
