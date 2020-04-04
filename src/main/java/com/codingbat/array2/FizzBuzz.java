package com.codingbat.array2;

public class FizzBuzz {
	public String[] fizzBuzz(int start, int end) {
		String[] ss = new String[end - start];
		for (int i = 0; i < ss.length; i++) {
			ss[i] = String.valueOf(start);
			if (start % 3 == 0) {
				ss[i] = "Fizz";
			} else if (start % 5 == 0) {
				ss[i] = "Buzz";
			} else if (start % 3 == 0 && start % 5 == 0) {
				ss[i] = "FizzBuzz";
			}

			start++;
		}

		return ss;
	}
}
