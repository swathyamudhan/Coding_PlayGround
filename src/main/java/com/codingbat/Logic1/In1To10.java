package com.codingbat.Logic1;

public class In1To10 {
  public boolean in1To10(int n, boolean outsideMode) {
    if (outsideMode) {
      if (n <= 1 || n >= 10) {
        return true;
      } else {
        return false;
      }
    }
    if (n >= 1 && n <= 10) {
      return true;
    }
    return false;
  }
}
