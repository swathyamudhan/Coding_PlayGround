package com.codingbat.Logic1;

public class LessBy10 {
  public boolean lessBy10(int a, int b, int c) {

    if (Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(c - a) >= 10) {
      return true;
    }
    return false;
  }

}
