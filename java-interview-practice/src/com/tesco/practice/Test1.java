package com.tesco.practice;

public class Test1 {
  public static void main(String[] args) {
    final Customer1 c = new Customer1();
    new Thread(){  
      public void run(){c.withdraw(15000);}  
      }.start(); 
      
      new Thread() {
        public void run() {c.deposit(300);}
      }.start();
      
  }
}
