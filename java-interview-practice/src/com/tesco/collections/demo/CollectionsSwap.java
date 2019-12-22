package com.tesco.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSwap {
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
  
  System.out.println("before swapping : "+list);
  
  Collections.swap(list, 0, 5);
  System.out.println("after swapping : "+list);
}
}
