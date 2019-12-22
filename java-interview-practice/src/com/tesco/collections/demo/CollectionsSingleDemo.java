package com.tesco.collections.demo;

import java.util.*;

public class CollectionsSingleDemo {
public static void main(String[] args) {
  String[] geeksList = {"1","2","3","1","4","1","2","3","4"};
  
  List list1 = new ArrayList<>(Arrays.asList(geeksList));
  System.out.println("before deleting the eliments"+ list1);
  
  list1.remove("1");
  System.out.println("after deleting 1 :" +list1);
  
  list1.remove("2");
  System.out.println("after deleting 1 :" +list1);
  
  List list2 = new ArrayList<>(Arrays.asList(geeksList));
  System.out.println("List2 before singleton delete"+list2);
  
  list2.removeAll(Collections.singleton("1"));
  System.out.println("List2 after singleton delete"+list2);
 
}
}
