package com.tesco.collections.demo;

import java.util.*;

public class CollectionsReverseOrder {
public static void main(String[] args) {
  List<Integer> list = new ArrayList<>();
  list.add(1);
  list.add(10);
  list.add(134);
  list.add(981);
  list.add(190);
  list.add(231);list.add(541);
  list.add(231);
  list.add(156);
  list.add(111);
  list.add(123);
  
  System.out.println(list);
  
  Collections.sort(list);
  System.out.println(list);
  
  Collections.sort(list, Collections.reverseOrder());
  System.out.println(list);
  
  Integer[] arr = {23,45,64,77,9,456,67};
  System.out.println(Arrays.toString(arr));
  
  Arrays.sort(arr);
  System.out.println(Arrays.toString(arr));
  
  Arrays.sort(arr, Collections.reverseOrder());
  System.out.println(Arrays.toString(arr));
}
}
