package com.codingbat.Logic1;

public class BlueTicket {
  public int blueTicket(int a, int b, int c) {
    int sumAB = a + b;
    int sumBC = b + c;
    int sumCA = c + a;
    if (sumAB == 10 || sumBC == 10 || sumCA == 10) {
      return 10;
    }
    if (sumAB + 10 > sumBC || sumAB + 10 > sumCA) {
      return 5;
    } else {
      return 0;
    }

  }
}
