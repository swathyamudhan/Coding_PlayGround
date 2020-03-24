package com.codingbat.Logic1;

public class FizzString {
  public String fizzString(String str) {
    if (str.charAt(0) == 'f') {
      return "Fizz";
    } else if (str.charAt(str.length() - 1) == 'b') {
      return "Buzz";
    } else if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
      return "FizzBuzz";
    }
    return str;
  }

}
