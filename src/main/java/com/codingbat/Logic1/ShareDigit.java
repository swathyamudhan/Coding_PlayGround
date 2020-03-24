package com.codingbat.Logic1;

public class ShareDigit {
  public boolean shareDigit(int a, int b) {
    int aDvar = a / 10;
    int aMvar = a % 10;


    if (Integer.toString(b).contains(Integer.toString(aDvar))
        || Integer.toString(b).contains(Integer.toString(aMvar))) {
      return true;
    }
    return false;
  }
}
