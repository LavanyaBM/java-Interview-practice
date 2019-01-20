package com.tesco.lamda;

public class InstanceMethodRefence {
  public void saySomething() {
    System.out.println("I love my life");
  }

  public static void main(String[] args) {
    InstanceMethodRefence in = new InstanceMethodRefence();
    Sayable s = in::saySomething;
    s.say();
  }
}
