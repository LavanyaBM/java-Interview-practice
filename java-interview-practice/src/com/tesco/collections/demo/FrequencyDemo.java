package com.tesco.collections.demo;

import java.util.*;

public class FrequencyDemo {
public static void main(String[] args) {
  List<String> list1 = new ArrayList<String>();
  list1.add("Lava");
  list1.add("Lava");
  list1.add("Lava");
  list1.add("Lava");
  list1.add("Lava");
  list1.add("Lava");
  list1.add("kavya");
  
  System.out.println(Collections.frequency(list1, "Lava"));
  
  Integer[] arr1 = {1,2,3,4,5,5,5,5,5};
  
  System.out.println(Collections.frequency(Arrays.asList(arr1), 5));
  
}
}
