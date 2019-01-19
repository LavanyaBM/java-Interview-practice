package com.tesco.practice;

public class sumOfSubsets {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    int n = arr.length;
    subsetsum(arr, 0, n-1, 0);
  }

  private static void subsetsum(int[] arr, int l, int r, int sum) {
    if (l > r) {
      System.out.println(sum + " ");
      return;
    }
    subsetsum(arr, l + 1, r, sum + arr[l]);
    subsetsum(arr, l + 1, r, sum);
  }
}
