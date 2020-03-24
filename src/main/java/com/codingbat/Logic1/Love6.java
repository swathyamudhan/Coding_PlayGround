package com.codingbat.Logic1;

public class Love6 {
  public boolean love6(int a, int b) {
    int sum = a + b;
    int diff = a - b;
    if (a == 6 || b == 6 || sum == 6 || Math.abs(diff) == 6) {
      return true;
    }
    return false;
  }

}
