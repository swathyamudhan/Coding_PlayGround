package com.codingbat.Logic1;

public class SumLimit {
  public int sumLimit(int a, int b) {
    int sum = a + b;
    if (String.valueOf(sum).length() > a) {
      return a;
    }
    return sum;
  }
}
