package com.josple.one.a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestServiceA {

  @Test
  public void test() {
    new ServiceA().someA();
  }


  @Test
  public void testThatIsFailing() {
    new ServiceA().someA();
    throw new RuntimeException();
  }
}