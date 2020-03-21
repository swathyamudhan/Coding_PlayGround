package main.java.com.codingbat.Logic1;

public class TeaParty {
  public int teaParty(int tea, int candy) {
    int temp = tea < candy ? tea : candy;
    if (!(tea <= 5 || candy <= 5) && (tea >= temp * 2 || candy >= temp * 2)) {
      return 2;
    } else if (tea >= 5 && candy >= 5) {
      return 1;
    }
    return 0;

  }
}
