package org.example;

public class MathFunc {

  public static int calculateFactorial(int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }

    int result = 1;
    if (n > 1) {
      for (int i = 1; i <= n; i++) {
        result = result * i;
      }
    }
    return result;
  }


  public static void main(String[] args) {
    System.out.println(calculateFactorial(6));

  }
}
