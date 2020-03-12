package com.codingbat.string1;

public class HelloName {
	public String helloName(String name) {
		return "Hello " + name + "!";
	}

	public String makeAbba(String a, String b) {

		return a + b + b + a;
	}

	public String makeTags(String tag, String word) {

		return "<" + tag + ">" + word + "</" + tag + ">";
	}

	public String makeOutWord(String out, String word) {
		String result = "";
		for (int i = 0; i < out.length(); i++) {
			if (i == 2) {
				result = result + word + out.charAt(i);
			} else {
				result = result + out.charAt(i);
			}

		}
		return result;
	}

	public String extraEnd(String str) {
		if (str.length() >= 2) {

			str = str.substring(str.length() - 3);
		}
		return str + str + str;
	}

	public String firstTwo(String str) {
		String result = str;
		if (str.length() >= 2) {
			result = result + str.substring(0, 2);
		}
		return result;
	}

	public String firstHalf(String str) {

		return str.substring(0, str.length() / 2);
	}

	public String withoutEnd(String str) {
		if (str.length() >= 2) {
			str = str.substring(1, str.length() - 1);
		}
		return str;
	}

	public String comboString(String a, String b) {
		String str = "";
		int alen = a.length();
		int blen = b.length();
		if (alen > blen) {
			str = b + a + b;
		} else {
			str = a + b + a;
		}
		return str;
	}

	public String nonStart(String a, String b) {
		String str = "";
		if (a.length() >= 1 && b.length() >= 1) {
			str = a.substring(1, a.length()) + b.substring(1, b.length());
		}
		return str;
	}

	public String left2(String str) {
		if (str.length() >= 2) {
			str = str.substring(2, str.length()) + str.substring(0, 2);
		}
		return str;
	}

	public String right2(String str) {

		return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
	}

	public String theEnd(String str, boolean front) {
		if (front == true) {
			return str.substring(0, 0 + 1);
		} else {
			return str.substring(str.length() - 1);
		}
	}

	public String withouEnd2(String str) {
		if (str.length() >= 2) {
			return str.substring(1, str.length() - 1);
		} else {
			return str.replace(str, "");
		}
	}

	public String middleTwo(String str) {
		if (str.length() >= 2) {
			return str.substring((str.length() - 1) / 2, (str.length() - 1) / 2 + 2);
		}
		return str;
	}

	public boolean endsLy(String str) {
		if (str.endsWith("ly")) {
			return true;
		}
		return false;
	}

	public String nTwice(String str, int n) {
		return str.substring(0, n) + str.substring(str.length() - n);
	}

	public String twoChar(String str, int index) {
		if (index > str.length() - 1 || index < 0) {
			str = str.substring(0, 2);
		} else {
			str = str.substring(index, index + 2);
		}
		return str;
	}

	public String middleThree(String str) {
		if (str.length() >= 3) {
			int i = (str.length() - 1) / 2;
			str = str.substring(i - 1, i + 2);
		}
		return str;
	}

	public boolean hasBad(String str) {
		if (str.length() >= 3) {
			if (str.substring(0, 3).equals("bad")) {
				return true;
			} else if (str.length() != 3 && str.substring(1, 4).equals("bad")) {
				return true;
			}
		}
		return false;
	}

	public String atFirst(String str) {
		String result = "@@";
		if (str.length() >= 2) {
			result = str.substring(0, 2);
		}
		if (str.length() < 2) {
			result = str.substring(0) + "@";
		}

		return result;
	}

	public String lastChars(String a, String b) {
		String result = "@@";
		if (a.isEmpty()) {
			a = "@@";

		}
		if (b.isEmpty()) {
			b = "@@";
		}
		if (a.length() >= 1 && b.length() >= 1) {
			result = a.substring(0, 1) + b.substring(b.length() - 1);
		}

		return result;
	}

	public String conCat(String a, String b) {
		if (a.isEmpty() || b.isEmpty()) {
			return a + b;
		}
		if (a.charAt(a.length() - 1) == b.charAt(0)) {
			return a.substring(0) + b.substring(1);
		} else {
			return a + b;
		}

	}

	public String lastTwo(String str) {
		if (str.length() <= 1) {
			return str;
		}
		return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
	}

	public String seeColor(String str) {
		if (str.startsWith("red")) {
			return "red";
		}
		if (str.startsWith("blue")) {
			return "blue";
		}
		return "";
	}

	public boolean frontAgain(String str) {
		if (str.length() <= 1) {
			return false;
		}
		if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
			return true;
		}
		return false;
	}

	public String minCat(String a, String b) {
		int slen;
		if (a.isEmpty() || b.isEmpty()) {
			return "";
		}
		if (a.length() < b.length()) {
			slen = a.length();
			return a.substring(0) + b.substring(b.length() - slen);
		} else {
			slen = b.length();
			return a.substring(a.length() - slen) + b.substring(0);
		}
	}

	public String extraFront(String str) {
		if (str.length() <= 1) {
			return str + str + str;
		}

		String result;
		result = str.substring(0, 2);
		return result + result + result;
	}

	public String without2(String str) {
		if (str.length() == 2) {
			return "";
		} else if (str.length() <= 1) {
			return str;
		}
		if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
			return str.substring(2);
		} else {
			return str;
		}
	}

	public String deFront(String str) {
		String result = "";
		if (str.length() >= 2) {
			if (str.charAt(0) == 'a' && str.charAt(1) != 'b') {
				result = str.charAt(0) + str.substring(2, str.length());
			} else if (str.charAt(1) == 'b' && str.charAt(0) != 'a') {
				result = str.substring(1, str.length());
			} else if (str.charAt(1) == 'b' && str.charAt(0) == 'a') {
				result = str;
			} else {
				result = str.substring(2, str.length());
			}
		}
		return result;
	}

	public String startWord(String str, String word) {
		if (str.isEmpty() || word.isEmpty() || str.length() < word.length()) {
			return "";
		}
		if (word.substring(1, word.length()).equals(str.substring(1, word.length()))) {
			return str.substring(0, word.length());
		}
		return "";
	}

	public String withoutX(String str) {
		if (str.length() <= 1) {
			return "";
		}
		String result = str;
		if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) != 'x') {
			result = str.substring(1);
		} else if (str.charAt(0) != 'x' && str.charAt(str.length() - 1) == 'x') {
			result = str.substring(0, str.length() - 1);
		} else if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
			result = str.substring(1, str.length() - 1);
		}
		return result;
	}

	public String withoutX2(String str) {
		if (str.length() == 1 && str.charAt(0) == 'x') {
			return "";
		}
		if (str.length() > 0 && str.substring(0, 2).equals("xx")) {
			return str.substring(2);
		}
		if (str.length() > 0 && str.charAt(0) == 'x') {
			return str.substring(1);
		}
		if (str.length() > 0 && str.charAt(1) == 'x') {
			return str.charAt(0) + str.substring(2);
		}

		return str;
	}

}
