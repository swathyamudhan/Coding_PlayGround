package main.java.com.codingbat.Logic1;

public class CaughtSpeeding {
  public int caughtSpeeding(int speed, boolean isBirthday) {

    int lowerLimit = isBirthday ? 65 : 60;
    int middleLimit = isBirthday ? 85 : 80;
    int upperLimit = isBirthday ? 86 : 81;

    if (speed <= lowerLimit) {
      return 0;
    } else if (speed > lowerLimit && speed <= middleLimit) {
      return 1;
    } else if (upperLimit >= 81) {
      return 2;
    }
    return 0;
  }


}
