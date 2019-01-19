package com.tesco.lamda;

import java.util.ArrayList;
import java.util.List;

public class LamdaForEachWithList {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Lavanya");
    list.add("Kavya");
    list.add("Lavanya MR");
    list.add("Prathibha");

    list.forEach(a -> System.out.println(a));
  }
}
