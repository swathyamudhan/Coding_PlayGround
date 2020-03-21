package main.java.com.codingbat.Logic1;

public class NearTen {
  public boolean nearTen(int num) {
    int val = num % 10;

    if ((val >= 0 && val <= 2) || (10 - val >= 0 && 10 - val <= 2)) {
      return true;
    }
    return false;

  }

}
