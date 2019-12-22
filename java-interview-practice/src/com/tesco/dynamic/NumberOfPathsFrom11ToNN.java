package com.tesco.dynamic;

public class NumberOfPathsFrom11ToNN {
  public static void main(String[] args) {
    System.out.println(numOfPaths(4, 4));
    System.out.println(numOfPathsMatrix(4,4));
  }

  private static int numOfPathsMatrix(int m, int n) {
    int[][] T = new int[m][n];
    for(int i=0;i<m;i++)
      T[0][i] = 1;
    for(int i=0;i<n;i++)
      T[i][0] = 1;
    for(int i=1; i<m;i++) {
      for(int j=1;j<n;j++) {
        T[i][j] = T[i][j-1]+T[i-1][j];
      }
    }
    return T[m-1][n-1];
  }

  private static int numOfPaths(int m, int n) {
    if (m == 1 || n == 1) {
      return 1;
    }
    return numOfPaths(m - 1, n) + numOfPaths(m, n - 1);
  }

}
