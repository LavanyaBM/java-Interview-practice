package com.tesco.practice;

public class Customer1 {
  int amount = 10000;
  
  synchronized void withdraw(int amount) {
  System.out.println("going to withdraw");
  if(this.amount < amount) {
    try {
      wait();
    }catch(Exception e) {
      System.out.println(e);
    }
  }
  this.amount -= amount;
  System.out.println(this.amount);
}
  
  synchronized void deposit(int amount) {
    System.out.println("entering into deposit");
    this.amount += amount;
    System.out.println("deposit completed");
    notify();
  }

}
