package com.tesco.lamda;

public class LamdaWithTwoParam {
  public static void main(String[] args) {
    Addable ad1 = (a, b) -> (a + b);
    System.out.println(ad1.add(100, 344));

    Addable ad2 = (int a, int b) -> (a + b);
    System.out.println(ad2.add(23, 45));

    // Addable ad3 = (double a, double b)->(a+b); compiler error we cant pass other than int here

    // we can give our own implementation
    Addable ad4 = (int p, int q) -> (p - q);
    System.out.println(ad4.add(80, 7));

    // we can give our own implementation
    Addable ad5 = (int p, int q) -> (p * q);
    System.out.println(ad5.add(80, 7));

    // we can give our own implementation
    Addable ad6 = (int p, int q) -> (p / q);
    System.out.println(ad6.add(80, 7));

    // we can give our own implementation
    Addable ad7 = (int p, int q) -> (p);
    System.out.println(ad7.add(80, 7));

    // we can give our own implementation
    Addable ad8 = (int p, int q) -> (0);
    System.out.println(ad8.add(80, 7));
  }
}
