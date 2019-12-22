package com.tesco.collections.demo;

import java.util.*;

public class IteratorDemo {
public static void main(String[] args) {
  List<Integer> list = new ArrayList<>();
  for(int i=1; i<=10; i++)
    list.add(i);
  
 Iterator itr = list.iterator();
  
  while(itr.hasNext()) {
    int i = (int) itr.next();
    System.out.println(i);
    if(i%2 == 0) {
      itr.remove();
    }
  }
  System.out.println(list);
}
}
