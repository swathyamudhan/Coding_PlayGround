package com.codingbat.string2;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class OneTwoTest {
	public void Test() {
		OneTwo frt = new OneTwo();
		assertEquals(frt.oneTwo("abcdefxyz"), "bcaefdyzx");
	}
}
