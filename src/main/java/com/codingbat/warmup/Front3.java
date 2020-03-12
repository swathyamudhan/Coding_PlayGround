package com.codingbat.warmup;

public class Front3 {
	public String front3(String str) {
		int var = str.length();
		String front;
		if (var > 3) {
			front = str.substring(0, 3);
		} else {
			front = str;
		}
		return front + front + front;
	}
}
