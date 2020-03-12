package com.codingbat.string2;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class WordEndsTest {
	public void Test() {
		WordEnds frt = new WordEnds();
		assertEquals(frt.wordEnds("abc1xyz1i1j", "1"), "cxziij");
	}
}
