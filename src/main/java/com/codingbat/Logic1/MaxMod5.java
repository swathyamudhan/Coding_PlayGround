package main.java.com.codingbat.Logic1;

public class MaxMod5 {
  public int maxMod5(int a, int b) {
    int valLarger = a > b ? a : b;
    int valSmaller = a < b ? a : b;
    if (a == b) {
      return 0;
    } else if (a % 5 == b % 5) {
      return valSmaller;
    }

    return valLarger;
  }

}
