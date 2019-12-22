package com.tesco.collections.demo;

import java.util.*;

public class Enumeration {
public static void main(String[] args) {
  Vector v = new Vector<>();
  for(int i=0; i<10; i++)
    v.addElement(i);
  
  java.util.Enumeration e = v.elements();
  
  while(e.hasMoreElements()) {
    System.out.println(e.nextElement());
    System.out.println("--------------");
  }
}
}
