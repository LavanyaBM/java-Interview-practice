package com.tesco.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsBinarySearch {
public static void main(String[] args) {
  List<Integer> list = new ArrayList<>();
  list.add(1);
  list.add(10);
  list.add(134);
  list.add(981);
  list.add(190);
  list.add(231);
  list.add(541);
  list.add(231);
  list.add(156);
  list.add(111);
  list.add(123);
  System.out.println(list);
  System.out.println(Collections.binarySearch(list, 134));
  System.out.println(Collections.binarySearch(list, 111));
  System.out.println("-----------------------------------------");
  
  Collections.sort(list);
  System.out.println(list);
  System.out.println(Collections.binarySearch(list, 134));
  System.out.println(Collections.binarySearch(list, 111));
  
  
  List<Domain> list2 = new ArrayList<>();
  list2.add(new Domain(1, "https://www.tesco.com"));
  list2.add(new Domain(3, "https://www.tesco2.com"));
  list2.add(new Domain(2, "https://www.tesco4.com"));
  
  Comparator<Domain> c = new Comparator<Domain>() 
  { 
      public int compare(Domain u1, Domain u2) 
      { 
          return u1.getId().compareTo(u2.getId()); 
      } 
  }; 
  
//  int index = Collections.binarySearch(1, new Domain(1, null), c);
  //System.out.println(list2);
}
}
