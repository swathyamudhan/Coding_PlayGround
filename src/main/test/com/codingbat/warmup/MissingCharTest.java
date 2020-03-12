package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test
public class MissingCharTest {

	public void MissingTest() {
		MissingChar ch = new MissingChar();
		assertEquals(ch.missingChar("kitten", 1), "ktten");
		assertEquals(ch.missingChar("kitten", 4), "kittn");
	}

}
