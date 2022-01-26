package edu.cnm.deepdive;

public class FizzBuzz {

  public static final String FIZZ = "Fizz";
  public static final String BUZZ = "Buzz";
  public static final String FIZZ_BUZZ = "FizzBuzz";

  public String check(int value) {
    String result;
    boolean divisibleby3 = value % 3 == 0;
    boolean divisibleby5 = value % 5 == 0;
    if (divisibleby3 && divisibleby5) {
      result = FIZZ_BUZZ;
    } else if (divisibleby3) {
      result = FIZZ;
    } else if (divisibleby5) {
      result = BUZZ;
    } else {
      result = String.valueOf(value);
    }
    return result;
  }


}


