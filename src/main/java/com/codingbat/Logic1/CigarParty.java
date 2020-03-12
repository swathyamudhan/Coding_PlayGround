package com.codingbat.Logic1;

public class CigarParty {
	public boolean cigarParty(int cigars, boolean isWeekend) {
		if (isWeekend == true) {
			if (cigars >= 40 || cigars <= 60) {
				return true;
			}
		}
		return false;
	}
}
