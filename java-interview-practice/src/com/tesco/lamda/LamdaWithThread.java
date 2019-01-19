package com.tesco.lamda;

public class LamdaWithThread {
  public static void main(String[] args) {
    Runnable r1 = new Runnable() {

      @Override
      public void run() {
        System.out.println("thread is running");
      }

    };
    Thread t1 = new Thread(r1);
    t1.start();
    Runnable r2 = () -> {
      System.out.println("thread is running");
    };

    Thread t2 = new Thread(r2);
    t2.start();

  }
}
