package com.codingbat.Logic1;

public class AlarmClock {
  public String alarmClock(int day, boolean vacation) {
    String weekDay = vacation ? "10:00" : "7:00";
    String weekEnds = vacation ? "off" : "10:00";
    if (day == 6 || day == 0) {
      return weekEnds;
    } else {
      return weekDay;
    }
  }
}
