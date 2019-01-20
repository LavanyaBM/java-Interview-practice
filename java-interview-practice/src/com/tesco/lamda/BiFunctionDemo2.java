package com.tesco.lamda;

import java.util.function.BiFunction;

public class BiFunctionDemo2 {
  public static void main(String[] args) {
    BiFunction<Integer, Integer, Integer> adder1 = Arithmetic2::add;
    BiFunction<Integer, Float, Float> adder2 = Arithmetic2::add;
    BiFunction<Float, Float, Float> adder3 = Arithmetic2::add;

    System.out.println(adder1.apply(10, 30));
    System.out.println(adder2.apply(07, 30.4f));
    System.out.println(adder3.apply(1f, 30.8f));
  }
}
