package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test
public class StringInputTest {

	public void StringTesting() {
		StringInput input = new StringInput();
		assertEquals(input.notString("candy"), "not candy");
	}
}
