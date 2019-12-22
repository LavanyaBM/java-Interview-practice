package com.tesco.default1.java8;

public class TestMultipleInterface implements I1,I2{
    public void m1() {
      //System.out.println("test method");
      I1.super.m1();
    }
    public static void main(String[] args) {
      TestMultipleInterface t = new TestMultipleInterface();
      t.m1();
    }
}
