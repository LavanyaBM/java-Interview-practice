package com.tesco.collections.demo;

import java.util.*;

public class RotateDemo {
public static void main(String[] args) {
  List<String>  list1 = new ArrayList<String>();
  list1.add("Lav");
  list1.add("Kav");
  list1.add("Bav");
  list1.add("Aav");
  list1.add("Vav");
  list1.add("Mav");
  list1.add("Nav");
  
  System.out.println("before rotating lisgt is : " + list1);
  
  Collections.rotate(list1, 2);
  
  System.out.println("After rotating List is : "+ list1);
  
  Integer[] arr1 = {1,2,3,4,5,6,7};
  
  System.out.println("Array before rotating : "+ Arrays.toString(arr1));
  
  Collections.rotate(Arrays.asList(arr1), 3);
  
  System.out.println(Arrays.toString(arr1));
  
}
}
