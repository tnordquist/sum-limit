package dev.tnordquist;

/**
 * CodingBat: Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same
 * number of digits as a. If the sum has more digits than a, just return a without b.
 */

public class SumLimit {

  public int sumLimit(int a, int b) {

    int aStr = String.valueOf(a).length();
    int sum = a + b;
    int lengthSum = String.valueOf(sum).length();

    if (lengthSum == aStr) {
      return sum;
    } else {
      return a;
    }
  }
}
