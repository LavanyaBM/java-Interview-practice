package com.tesco.lamda;

import java.util.StringJoiner;

public class StringJoinerDemo {
  public static void main(String[] args) {
    StringJoiner sj = new StringJoiner(",");
    sj.add("Lavanya");
    sj.add("Loves");
    sj.add("India");
    sj.add("More");
    sj.add("Than");
    sj.add("Her BF");
    System.out.println(sj);
  }
}
