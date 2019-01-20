package com.tesco.lamda;

import java.util.Arrays;

public class ParallelSortWithIndex {
  public static void main(String[] args) {
    int[] intarray = {9, 8, 5, 6, 3, 2, 0};
    for (int i : intarray) {
      System.out.println(i);
    }
    System.out.println("-------------");
    Arrays.parallelSort(intarray, 0, 4);
    for (int i : intarray) {
      System.out.println(i);
    }
  }
}
