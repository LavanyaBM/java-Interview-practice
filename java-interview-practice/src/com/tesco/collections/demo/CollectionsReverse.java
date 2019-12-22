package com.tesco.collections.demo;

import java.util.*;

public class CollectionsReverse {
public static void main(String[] args) {
  List<String> list = new ArrayList<String>();
  list.add("Lav");
  list.add("Kav");
  list.add("Laaaaav");
  list.add("Ganav");
  list.add("Sun");
  System.out.println(list);
  System.out.println("--------");
  
  Collections.reverse(list);
  System.out.println(list);
  
  Integer[] arr = {1,2,3,45,5};
  System.out.println(Arrays.toString(arr));
  
  Collections.reverse(Arrays.asList(arr));
  System.out.println(Arrays.toString(arr));
  
}
}
