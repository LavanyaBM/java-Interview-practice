package com.tesco.lamda;

public class StaticMethodReference {
public static void saySomething() {
  System.out.println("I loveyou so much dear");
}
public static void main(String[] args) {
  Sayable s = StaticMethodReference::saySomething;
  s.say();
}
}
