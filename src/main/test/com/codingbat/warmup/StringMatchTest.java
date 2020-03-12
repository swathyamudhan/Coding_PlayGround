package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test
public class StringMatchTest {
	public void Test() {
		StringMatch front = new StringMatch();
		assertEquals(front.stringMatch("xxcaazz", "xxbaaz"), 3);
		// assertEquals(front.endUp("hi there"), "hi thERE");
		// assertEquals(front.endUp("hi"), "HI");
	}
}
