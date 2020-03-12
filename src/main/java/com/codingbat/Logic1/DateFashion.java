package com.codingbat.Logic1;

public class DateFashion {
  public int dateFashion(int you, int date) {
    boolean youRange = you >= 8 && you <= 10;
    boolean dateRange = date >= 8 && date <= 10;

    if ((youRange && date != 2) || (dateRange && you != 2)) {
      return 2;
    } else if (you <= 2 || date <= 2) {
      return 0;
    } else {
      return 1;
    }
  }

}
