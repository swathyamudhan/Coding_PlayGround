package com.codingbat.warmup;

public class StartHi {
	public boolean startHi(String str) {
		boolean flag = false;
		String[] front = str.split("\\s+");
		for (int i = 0; i < front.length; i++) {
			if (front[0].equals("hi")) {
				flag = true;
			} else {
				flag = false;
			}
		}
		return flag;
	}
}
