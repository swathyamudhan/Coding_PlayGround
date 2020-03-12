package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class Front3Test {
	public void Test() {
		Front3 frt = new Front3();
		assertEquals(frt.front3("ab"), "ababab");
		assertEquals(frt.front3("Chocolate"), "ChoChoCho");

	}
}
