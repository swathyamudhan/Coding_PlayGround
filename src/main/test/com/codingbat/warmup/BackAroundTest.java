package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test
public class BackAroundTest {

	public void Test() {
		BackAround back = new BackAround();
		assertEquals(back.backAround("cat"), "tcatt");
		assertEquals(back.backAround("a"), "aaa");
	}
}
