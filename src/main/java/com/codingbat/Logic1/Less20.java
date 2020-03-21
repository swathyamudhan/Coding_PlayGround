package main.java.com.codingbat.Logic1;

public class Less20 {
  public boolean less20(int n) {
    int val = n % 20;

    if (20 - val == 1 || 20 - val == 2) {
      return true;
    }
    return false;

  }

}
