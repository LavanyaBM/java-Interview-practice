package com.tesco.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LamdaCollectionComarator {
  public static void main(String[] args) {
    List<Product> list = new ArrayList<>();
    list.add(new Product(1, "Lavanya", 1.4f));
    list.add(new Product(2, "Kavya", 1.4f));
    list.add(new Product(3, "thrinesha", 1.4f));
    list.add(new Product(4, "Lavanya MR", 1.4f));
    list.add(new Product(5, "Sonu", 1.4f));

    Collections.sort(list, (q, r) -> {
      return q.name.compareTo(r.name);
    });
    for (Product p : list) {
      System.out.println(p.id + " " + p.name + " " + p.price);
    }
    System.out.println("---------");
    list.forEach(a ->{
      System.out.println(a.id+" "+a.name+" "+a.price);
    });
  }
}
