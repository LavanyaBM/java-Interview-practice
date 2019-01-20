package com.tesco.lamda;

import java.util.Optional;

public class OptionalDemo {
  public static void main(String[] args) {
    String[] str = new String[10];

    Optional<String> optNull = Optional.ofNullable(str[5]);
    if (optNull.isPresent()) {
      System.out.println(str[5].toLowerCase());
    } else {
      System.out.println("it has null values");
    }

    str[3] = "lavanya";

    Optional<String> str3 = Optional.ofNullable(str[3]);
    if (str3.isPresent()) {
      System.out.println(str[3].toLowerCase());
    } else {
      System.out.println("null pointer");
    }
    
    str3.ifPresent(System.out::println);
    System.out.println(str3.get());
  }
}
