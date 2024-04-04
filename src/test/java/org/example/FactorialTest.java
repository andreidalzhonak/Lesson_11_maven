package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {

  private MathFunc math;

  @Before
  public void init() {
    math = new MathFunc();
  }

  @After
  public void tearDown() {
    math = null;
  }

  @Test
  public void calculateFactorial() {
    assertTrue(math.calculateFactorial(0) == 1);
    assertTrue(math.calculateFactorial(1) == 1);
    assertTrue(math.calculateFactorial(6) == 720);
  }

  @Test(expected = IllegalArgumentException.class)
  public void calculateFactorialNegative() {
    math.calculateFactorial(-1);
  }

}

