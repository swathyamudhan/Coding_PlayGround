package main.java.com.codingbat.Logic2;

public class Logic2 {
  public boolean makeBricks(int small, int big, int goal) {
    int sVar = 1 * small;
    int lVar = 5 * big;
    int val = sVar * small + lVar * big;
    while (val < goal) {
      return true;
    }


    return false;
  }
}
