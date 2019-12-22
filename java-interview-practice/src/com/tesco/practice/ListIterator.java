package com.tesco.practice;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {
public static void main(String[] args) {
  List<String> list = new ArrayList<>();
  list.add("Lav");
  list.add("Kav");
  list.add("Lavanya");
  list.add("Kavya");
  list.add("Kumpu");
  list.add("Panda");
  list.add("Strawberry");
  java.util.ListIterator<String> listIterator = list.listIterator();
  while(listIterator.hasNext()) {
    System.out.println(listIterator.next());
  }
  while(listIterator.hasPrevious()) {
    System.out.println(listIterator.previous());
  }
}
}
