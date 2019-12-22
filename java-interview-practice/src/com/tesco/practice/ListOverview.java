package com.tesco.practice;

import java.util.ArrayList;
import java.util.List;

public class ListOverview {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("lav");
    list.add("kav");
    list.add("kav2");
    list.add("kav5");
    list.add("kav7");
    list.add("");
    list.add("");
    list.add("");
    list.add("");
    System.out.println(list);
    for(int i=list.size()-1; i>=0; i--) {
      if(list.get(i).equalsIgnoreCase("")) {
        list.remove(i);
      }
    }
    System.out.println(list);
    String[] rowElements = list.toArray(new String[0]);
    System.out.println(rowElements);
  }
}
