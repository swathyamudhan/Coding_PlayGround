package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test
public class FrontBackTest {

	public void FrontBack() {
		FrontBack front = new FrontBack();
		assertEquals(front.frontBack("a"), "a");
	}
}
