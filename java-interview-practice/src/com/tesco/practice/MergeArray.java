package com.tesco.practice;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeArray {
public static void main(String[] args) {
  Integer[] a = {1,2,3,4,5};
  Integer[] b = {0,9,8,7,6,6};
  
  Object[] c = Stream.of(a, b) 
      .flatMap(Stream::of) 
      .toArray(); 
  System.out.println(Arrays.toString(c));
  
  Object[] d = Stream.concat(Arrays.stream(a), Arrays.stream(b)).flatMap(Stream::of).toArray();
  System.out.println(Arrays.toString(d));
  
}
}
