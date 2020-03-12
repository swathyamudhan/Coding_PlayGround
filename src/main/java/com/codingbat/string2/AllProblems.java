package com.codingbat.string2;

public class AllProblems {
	public String doubleChar(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			result = result + str.charAt(i) + str.charAt(i);
		}
		return result;
	}

	public int countHi(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("hi")) {
				count++;
			}
		}
		return count;
	}

	public boolean catDog(String str) {
		int catcount = 0, dogcount = 0;
		if (str.length() <= 2) {
			return true;
		}
		if (str.length() <= 3) {
			return false;
		} else {
			for (int i = 0; i <= str.length() - 3; i++) {
				if (str.substring(i, i + 3).equals("cat")) {
					catcount++;
				}
			}
			for (int i = 0; i <= str.length() - 3; i++) {
				if (str.substring(i, i + 3).equals("dog")) {
					dogcount++;
				}
			}
		}
		if (catcount == dogcount) {
			return true;
		} else {
			return false;
		}

	}

	public int countCode(String str) {
		int count = 0;
		for (int i = 0; i <= str.length() - 4; i++) {
			if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e")) {
				count++;
			}
		}
		return count;
	}

	public boolean endOther(String a, String b) {
		String la = a.toLowerCase();
		String lb = b.toLowerCase();
		int len = lb.length();
		if (la.length() < lb.length()) {
			len = la.length();
		}
		if (la.length() == len) {
			if (la.substring(0).equals(lb.substring(lb.length() - la.length()))) {
				return true;
			}
		}
		if (lb.length() == len) {
			if (lb.substring(0).equals(la.substring(la.length() - lb.length()))) {
				return true;
			}
		}
		return false;
	}
}
