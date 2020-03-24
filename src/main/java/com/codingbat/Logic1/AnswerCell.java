package com.codingbat.Logic1;

public class AnswerCell {
  public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    if (isAsleep) {
      return false;
    } else if (isMom) {
      return true;
    } else if (isMorning) {
      return false;
    }
    return false;
  }

}
