package com.tesco.lamda;

public class LamdaEx3 {
public static void main(String[] args) {
  Sayable s = ()->{
    System.out.println("I have nothing to say");
  };
  s.say();
}
}
