package com.tesco.lamda;

public class InstanceDemo {
  int i;

  void display() {
    i = i + 1;
    System.out.println(i);
  }

  public static void main(String[] args) {
    InstanceDemo id = new InstanceDemo();
    id.display();
    id.display();
    InstanceDemo id2 = new InstanceDemo();
    id2.display();
  }
}
