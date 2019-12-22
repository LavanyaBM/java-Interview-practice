package com.tesco.dynamic;

public class MaximumSumPaths {
public static void main(String[] args) {
  int[][] T = {{1,2,3},{4,8,2},{1,5,3}};
  System.out.println(sumOfPaths(3,3,T));
}

private static int sumOfPaths(int m, int n, int[][] cost) {
  int[][] T = new int[m][n];
  
  int sum =0;
  for(int i=0;i<m;i++) {
    T[i][0] = sum+T[i][0];
  }
   sum = 0;
  for(int i=0;i<n;i++) {
    T[0][i] = sum+T[0][i];
  }
  
  for(int i=1;i<m;i++) {
    for(int j=1;j<n;j++) {
      T[i][j] = Math.min(T[i-1][j], T[i][j-1]) + cost[i][j];
    }
  }
  
  for(int i=1;i<m;i++) {
    for(int j=1;j<n;j++) {
      System.out.println(T[i][j] );
      
    }
  }
  
    
  return T[m-1][n-1];
}
}
