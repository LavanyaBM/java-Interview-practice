package com.tesco.practice;

public class CommandArgs {
  public static void main(String[] args) {
    if (args.length > 0) {
      System.out.println("we have args");
      for (int i = 0; i < args.length; i++) {
        System.out.println(args[i]);
      }
    } else {
      System.out.println("no args");
    }
    
    String str = "LAvanya";
    System.out.println(str);
    str = "thrini";
    System.out.println(str);
    
  }
}
