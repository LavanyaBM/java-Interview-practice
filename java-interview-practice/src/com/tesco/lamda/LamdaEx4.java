package com.tesco.lamda;

public class LamdaEx4 {
  public static void main(String[] args) {
    Sayable2 s = (name) -> {
      System.out.println("Hello " + name);
    };
    s.say("LAVANYA");

    Sayable2 s2 = name -> {
      System.out.println("HI " + name);
    };
    s2.say("THRINESHA");
  }
}
