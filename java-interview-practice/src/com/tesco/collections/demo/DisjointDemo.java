package com.tesco.collections.demo;

import java.util.*;

public class DisjointDemo {
public static void main(String[] args) {
  List<String> list1 = new ArrayList<String>();
  list1.add("Lava");
  list1.add("Kav");
  list1.add("Thrini");
  list1.add("Sem");
  list1.add("G");
  
  List<String> list2 = new Vector<String>();
  list2.add("Lava");
  list2.add("Kav");
  list2.add("Thrini");
  list2.add("Sem");
  list2.add("G");
  
  System.out.println(Collections.disjoint(list1, list2));
  
  
  Integer[] arr1 = {1,2,3,4};
  Integer[] arr2 = {1,2,3,4};
  Integer[] arr3 = {1,2};
  Integer[] arr4 = {1,2,3,4};
  Integer[] arr5 = {1,2,3,4};
  
  System.out.println(Collections.disjoint(Arrays.asList(arr1), Arrays.asList(arr2)));
  System.out.println(Collections.disjoint(Arrays.asList(arr1), Arrays.asList(arr3)));
  
  System.out.println(Arrays.asList(arr1));
  System.out.println(Arrays.asList(arr2));
  System.out.println(Arrays.asList(arr3));
}
}
