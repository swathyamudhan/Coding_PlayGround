package com.codingbat.ap1;

public class UserCompare {
	public int userCompare(String aName, int aId, String bName, int bId) {
		int pos = 1;
		int neg = -1;
		int val = aName.compareTo(bName);
		if (aName.equals(bName)) {
			return Integer.valueOf(aId).compareTo(Integer.valueOf(bId));
		}
		if (val >= 1) {
			return pos;
		} else if (val < 1) {
			return neg;
		}
		return 0;
	}
}
