package com.tesco.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LamdaStream {
  public static void main(String[] args) {
    List<Product> list = new ArrayList<>();
    list.add(new Product(1, "A", 10000f));
    list.add(new Product(1, "A", 5000f));
    list.add(new Product(1, "A", 50000f));
    list.add(new Product(1, "A", 80000f));
    list.add(new Product(1, "A", 77000f));
    list.add(new Product(1, "A", 99000f));
    list.add(new Product(1, "A", 78000f));

    Stream<Product> filteredData = list.stream().filter(p -> p.price < 10000);

    filteredData.forEach(p -> {
      System.out.println(p.id + " " + p.name + " " + p.price);
    });
    System.out.println("----------------");

    Stream<Product> filteredData2 = list.stream().filter(p -> p.price > 10000);

    filteredData2.forEach(p -> {
      System.out.println(p.id + " " + p.name + " " + p.price);
    });
  }
}
