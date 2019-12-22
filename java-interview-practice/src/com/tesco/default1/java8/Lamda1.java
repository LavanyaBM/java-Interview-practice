package com.tesco.default1.java8;

import java.util.ArrayList;

public class Lamda1 {
public static void main(String[] args) {
  ArrayList<Integer> arrL = new ArrayList<>();
  arrL.add(1);
  arrL.add(2);
  arrL.add(3);
  arrL.add(4);
  arrL.add(5);
  
  arrL.forEach(p -> System.out.println(p));
  System.out.println("---------------------");
  arrL.forEach(p ->{
    if (p%2 == 0)
      System.out.println(p);
  });
}
}
