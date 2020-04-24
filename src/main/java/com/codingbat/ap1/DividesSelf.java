package com.codingbat.ap1;

public class DividesSelf {
	public boolean dividesSelf(int n) {
		if (String.valueOf(n).contains("0")) {
			return false;
		}
		boolean Lflag = false;
		boolean flag = false;
		int leftDigit = n / 10;
		int right = n % 10;

		while (leftDigit != 0) {
			int rightDigit = leftDigit % 10;
			if (n % rightDigit == 0) {
				Lflag = true;
			} else {
				Lflag = false;
			}
			leftDigit = leftDigit / 10;
		}

		if (n % right == 0 && Lflag) {
			flag = true;
		}
		return flag;
	}
}
