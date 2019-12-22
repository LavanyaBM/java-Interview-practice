package com.tesco.practice;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassLoader {
  public static void main(String[] args) {
    Student s = new Student();
    Student s2 = new Student();
    
    Class c = s.getClass();
    Class c2 = s2.getClass();
    
    System.out.println(c.getName());
    System.out.println("----------------------");
    Method[] methods = c.getDeclaredMethods();
    for (Method method : methods) {
      System.out.println(method);
    }
    System.out.println("----------------------");
    Field[] fields = c.getDeclaredFields();
    for (Field field : fields) {
      System.out.println(field);
    }
    System.out.println("----------------------");
    System.out.println(c==c2);

  }
}
