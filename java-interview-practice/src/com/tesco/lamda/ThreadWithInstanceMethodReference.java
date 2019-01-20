package com.tesco.lamda;

public class ThreadWithInstanceMethodReference {
  public void saySomething() {
    System.out.println("I will definitely win, may not  instantly but one day definitely");
  }

  public static void main(String[] args) {
    ThreadWithInstanceMethodReference st = new ThreadWithInstanceMethodReference();
    Thread t = new Thread(st::saySomething);
    t.start();
  }
}
