package com.codingbat.Logic1;

public class SortaSum {
  public int sortaSum(int a, int b) {
    int sum = a + b;
    boolean flag = sum >= 10 && sum <= 19;
    if (flag) {
      return 20;
    } else {
      return sum;
    }


  }

}
