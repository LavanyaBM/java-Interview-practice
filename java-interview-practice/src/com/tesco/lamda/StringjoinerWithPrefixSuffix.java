package com.tesco.lamda;

import java.util.StringJoiner;

public class StringjoinerWithPrefixSuffix {
  public static void main(String[] args) {
    StringJoiner sj = new StringJoiner(",", "[", "]");
    sj.add("Lavanya");
    sj.add("Loves");
    sj.add("India");
    sj.add("More");
    sj.add("Than");
    sj.add("Her BF");
    System.out.println(sj);

    StringJoiner sj2 = new StringJoiner(",", "[", "]");
    sj2.add("Thrinesh");
    sj2.add("Loves");
    sj2.add("India");
    sj2.add("More");
    sj2.add("Than");
    sj2.add("His GF");
    System.out.println(sj2);

    StringJoiner sj3 = sj.merge(sj2);
    System.out.println(sj3);
    System.out.println(sj);
    
    System.out.println(sj.length());
    System.out.println(sj2.length());
    System.out.println(sj3.length());
    
  }

}
