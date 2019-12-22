package com.tesco.practice;

public class RoundingOff {
public static void main(String[] args) {
  double a = 0.7;
  double b = 0.9;
  
  double x = a + 0.1;
  double y = b - 0.1;
  System.out.println(a);
  System.out.println(b);
  System.out.println("x = "+ x);
  System.out.println("y = "+ y);
  
  
  
  System.out.println("-------------------");
  double c = 1.0;
  double d = 0.10;
  System.out.println(c);
  System.out.println(d);
  
  double x1 = 9*d;
  System.out.println(x1);
  
  c = c -(x1);
  System.out.println(c);
}

}
