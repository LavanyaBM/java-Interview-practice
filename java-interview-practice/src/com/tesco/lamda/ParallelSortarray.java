package com.tesco.lamda;

import java.util.Arrays;

public class ParallelSortarray {
  public static void main(String[] args) {
    int[] intarray = {9, 8, 5, 6, 3, 2, 0};
    for (int i : intarray) {
      System.out.println(i);
    }
    System.out.println("-------------");
    Arrays.parallelSort(intarray);
    for (int i : intarray) {
      System.out.println(i);
    }
  }
}
