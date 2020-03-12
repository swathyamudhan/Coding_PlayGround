package com.codingbat.string3;

public class SumNumbers {
	public int sumNumbers(String str) {
		int sum = 0;

		String currentNumber = "0";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				currentNumber = currentNumber + str.substring(i, i + 1);

			} else {
				sum = sum + Integer.parseInt(currentNumber);
				currentNumber = "0";

			}
		}
		sum = sum + Integer.parseInt(currentNumber);

		return sum;
	}

}
