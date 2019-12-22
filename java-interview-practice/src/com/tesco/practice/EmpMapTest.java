package com.tesco.practice;

import java.util.HashMap;
import java.util.Map;

public class EmpMapTest {
  public static void main(String[] args) {
    Map<Emp,String> empMap = new HashMap<>();
    Emp emp1 = new Emp(1,"lav");
    empMap.put(emp1, "Verified");
    emp1.setName("Kav");
    System.out.println(empMap.get(emp1));
  }
}
