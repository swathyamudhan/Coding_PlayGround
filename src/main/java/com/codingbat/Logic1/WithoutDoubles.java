package com.codingbat.Logic1;

public class WithoutDoubles {
  public int withoutDoubles(int die1, int die2, boolean noDoubles) {
    int sum = die1 + die2;
    if (noDoubles && die1 == die2) {
      if (die1 != 6) {
        return die1 + 1 + die2;
      } else {
        return 1 + die2;
      }
    }
    return sum;
  }
}
