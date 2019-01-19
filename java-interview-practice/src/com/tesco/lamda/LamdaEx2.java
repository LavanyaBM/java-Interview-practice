package com.tesco.lamda;

public class LamdaEx2 {
  public static void main(String[] args) {
    int width = 10;
    Printable p = () -> {
      System.out.println("printing    " + width);
    };
    p.print();
  }
}
