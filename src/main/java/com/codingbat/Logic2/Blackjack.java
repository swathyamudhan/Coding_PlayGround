package com.codingbat.Logic2;

public class Blackjack {
	public int blackjack(int a, int b) {
		if (a > 21) {
			a = 0;
		}
		if (b > 21) {
			b = 0;
		}
		return a > b ? a : b;
	}

}
