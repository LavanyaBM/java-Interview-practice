package com.tesco.practice;

import java.util.*;

public class SubListRemoval {
public static void main(String[] args) {
  ArrayList<String> list = new ArrayList<String>();
  list.add("Lav");
  list.add("Kav");
  list.add("Lavaaaaa");
  list.add("Sun");
  list.add("Amma");
  list.add("Appa");
  
  System.out.println(list);
  
  list.subList(1, 2).clear();
  
  System.out.println("after clearing the list : "+ list);
  
 ArrayList<Integer> list1 = new ArrayList<>();
 
 list1.add(1);
 list1.add(2);
 list1.add(3);
 
  
}
}
