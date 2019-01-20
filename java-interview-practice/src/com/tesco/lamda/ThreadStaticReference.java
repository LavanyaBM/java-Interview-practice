package com.tesco.lamda;

public class ThreadStaticReference {
  public static void saySomething() {
    System.out.println("I love you so much, Thread is running ");
  }

  public static void main(String[] args) {
    Thread t1 = new Thread(ThreadStaticReference::saySomething);
    t1.start();
  }
}
