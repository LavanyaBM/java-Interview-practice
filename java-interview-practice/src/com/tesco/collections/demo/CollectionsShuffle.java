package com.tesco.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsShuffle {
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
  System.out.println("--------------------");
  Collections.shuffle(list);
  System.out.println(list);
  System.out.println("--------------------");
  Collections.shuffle(list, new Random());
  System.out.println(list);
  System.out.println("--------------------");
  Collections.shuffle(list, new Random(3));
  System.out.println(list);
  System.out.println("--------------------");
  Collections.shuffle(list, new Random(2));
  System.out.println(list);
  
}
}
