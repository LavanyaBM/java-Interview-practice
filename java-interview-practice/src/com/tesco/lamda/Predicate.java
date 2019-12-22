package com.tesco.lamda;

public class Predicate {
  public static void main(String[] args) {
    int[] x = {12,3,4,4,6,78,90,54,65,73};
    java.util.function.Predicate<Integer> p1 = i->i%2 == 0;
    java.util.function.Predicate<Integer> p2 = i-> i >10;
    
    for (int i : x) {
    /*  if(p1.and(p2).test(i)) {
        System.out.println(i);
      }*/
    /*  if(p1.or(p2).test(i)) {
        System.out.println(i);
      }*/
      if(p1.negate().test(i)) {
        System.out.println(i);
      }
    }
  }
}
