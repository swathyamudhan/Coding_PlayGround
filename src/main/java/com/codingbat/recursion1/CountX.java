package com.codingbat.recursion1;

public class CountX {

	public int countX(String str) {
		if (str.equals("")) {
			return 0;
		}
		return (str.charAt(0) == 'x' ? 1 : 0) + countX(str.substring(1, str.length()));
	}

}
