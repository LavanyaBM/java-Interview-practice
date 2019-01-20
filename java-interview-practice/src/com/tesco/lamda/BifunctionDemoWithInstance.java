package com.tesco.lamda;

import java.util.function.BiFunction;

public class BifunctionDemoWithInstance {
  public static void main(String[] args) {
    BiFunction<Integer, Integer, Integer> adder = new ArithmeticNonStatic()::add;
    System.out.println(adder.apply(10, 10));

  }
}
