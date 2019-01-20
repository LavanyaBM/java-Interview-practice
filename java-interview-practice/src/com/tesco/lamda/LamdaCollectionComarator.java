package com.tesco.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

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
    System.out.println("--------------------------------------");
    Float totalPrice = list.stream().map(p ->p.price).reduce(0.0f, (sum,price)->sum+price);
    System.out.println(totalPrice);
    
    float tprice = list.stream().map(p->p.price).reduce(0.0f, Float::sum);
    System.out.println(tprice);
    System.out.println("--------------");
    
    double sum = list.stream().collect(Collectors.summingDouble(p->p.price));
    System.out.println(sum);
    
    System.out.println("---------------");
    Product prod = list.stream().max((product1, product2)->product1.price>product2.price?1:-1).get();
    System.out.println(prod.price+" :"+prod.name);
    
    System.out.println("----------------");
    long count = list.stream().filter(p->p.price>30000).count();
    System.out.println(count);
    
    System.out.println("----------------");
    Set<Float> setF = list.stream().filter(p->p.price>0.0f).map(p->p.price).collect(Collectors.toSet());
    System.out.println(setF);
    
    
    System.out.println("----------------");
    Map<Integer,String> map = list.stream().collect(Collectors.toMap(p->p.id, p->p.name));
    System.out.println(map);
    for(Entry mapentry:map.entrySet()) {
      System.out.println(mapentry.getKey()+"  "+mapentry.getValue());
    }
    
    System.out.println("----------------");
    list.forEach(p->System.out.println(p.name));
    
    
    System.out.println("----------------");
    list.forEach(System.out::println);
    
    
    System.out.println("----------------");
    list.stream().forEachOrdered(p->System.out.println(p.name));
    
    System.out.println("----------------");
    Double avg = list.stream().collect(Collectors.averagingDouble(p->p.price));
    System.out.println(avg);
    
    System.out.println("----------------");
    double counting = list.stream().collect(Collectors.counting());
    System.out.println(counting);
    
    
  }
}
