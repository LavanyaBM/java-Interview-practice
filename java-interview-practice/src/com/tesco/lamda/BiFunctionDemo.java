package com.tesco.lamda;

import java.util.function.BiFunction;

public class BiFunctionDemo {
  public static void main(String[] args) {
    BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
    int result = adder.apply(10, 30);
    System.out.println(result);
  }
}
