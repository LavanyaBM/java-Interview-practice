package com.tesco.practice;

import java.util.Arrays;

public class ArraysDemo {
public static void main(String[] args) {
  Integer[] intArr = {1,2,3,4,5,6};
  System.out.println(Arrays.toString(intArr));
  Arrays.fill(intArr, 0);
  System.out.println(Arrays.toString(intArr));
  //Arrays.fill(intArr, 'a');
  System.out.println(Arrays.toString(intArr));
  
  int[] arr = new int[3]; 
  
  // Assigning long value to int type. 
  arr[0] = (int) 10l; 
  arr[1] = 'a'; 
  byte b = 10; 
  arr[2] = b; 

  System.out.println(arr[0] + arr[1] + arr[2]); 
  

  int inarr1[] = {1, 2, 3}; 
  int inarr2[] = {1, 2, 3};  
  Object[] arr1 = {inarr1};  // arr1 contains only one element 
  Object[] arr2 = {inarr2};  // arr2 also contains only one element 
  Object[] outarr1 = {arr1}; // outarr1 contains only one element 
  Object[] outarr2 = {arr2}; // outarr2 also contains only one element         
  if (Arrays.deepEquals(outarr1, outarr2)) 
      System.out.println("Same"); 
  else
      System.out.println("Not same"); 
}
}
