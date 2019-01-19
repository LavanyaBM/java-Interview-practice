package com.tesco.lamda;

public class LamdaWithMultipleReturnStatement {
  public static void main(String[] args) {
    Sayable3 s1 = (message) -> {
      String str1 = "I would like to tell you";
      String str2 = str1 + message;
      return str2;
    };
    System.out.println(s1.say("time is precious"));

  }
}
