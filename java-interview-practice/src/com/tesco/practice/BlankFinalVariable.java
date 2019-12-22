package com.tesco.practice;

import java.util.*;

public class BlankFinalVariable {
  final int i;

  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();
    arr.add(12);
    arr.add(1);
    arr.add(2);
    arr.add(5);
    arr.add(125);
    arr.add(1255);
    
    for(int i =0; i<arr.size(); i++) {
      System.out.println(arr.get(i));
      arr.add(arr.get(i));
    }
    
  }

  public BlankFinalVariable() {
    this(12);
  }

  public BlankFinalVariable(int x) {
    i = x;
  }
}
