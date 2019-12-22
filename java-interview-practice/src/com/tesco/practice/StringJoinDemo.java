package com.tesco.practice;

import java.util.*;
import java.util.stream.Collectors;

public class StringJoinDemo {
public static void main(String[] args) {
  List<String> list = new ArrayList<>(Arrays.asList("Lav","Kav","Mav","Nan"));
  
  System.out.println(list);
  
  String str = String.join(", ", list);
  
  System.out.println(str);
  
  List<Integer> intList = new ArrayList<>();
  intList.add(1);
  intList.add(2);
  intList.add(3);
  intList.add(3);
  intList.add(3);
  
  System.out.println(intList);
  
  List<Integer> newList = new ArrayList<>();
  for(Integer element : intList) {
   if(!newList.contains(element)) {
     newList.add(element);
   }
  }
  
  System.out.println(newList);
  
  System.out.println("-------------------------------");
  List<Integer> inList = new ArrayList<>();
  inList.add(1);
  inList.add(2);
  inList.add(3);
  inList.add(3);
  inList.add(3);
  
  System.out.println(inList);
  
  Set<Integer> set = new LinkedHashSet<>();
  
  set.addAll(inList);
  inList.clear();
  inList.addAll(set);
  
  System.out.println(inList);
  
  
  System.out.println("-------------------------------");
  List<Integer> iList = new ArrayList<>();
  iList.add(1);
  iList.add(2);
  iList.add(3);
  iList.add(3);
  iList.add(3);
  
  System.out.println(iList);
  
  List<Integer> newList1 = new ArrayList<>();
  
  newList1 = iList.stream().distinct().collect(Collectors.toList());
  
  System.out.println(newList1);
  
  
}
}
