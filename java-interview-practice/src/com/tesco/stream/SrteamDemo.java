package com.tesco.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SrteamDemo {
  
public static void main(String[] args) {
 
  List<Integer> numbers = Arrays.asList(1,2,3,4,5);
  List<Integer> sqr = numbers.stream().map(p -> p*p).collect(Collectors.toList());
  System.out.println(sqr);
  System.out.println("---------------------------------------------------------");
  
  List<String> names = Arrays.asList("Lav", "Kav", "Sun");
  List<String> filteredNames = names.stream().filter(p -> p.startsWith("L")).collect(Collectors.toList());
  System.out.println(filteredNames);
  System.out.println("---------------------------------------------------------");
  
  List<Integer> numberr1 = Arrays.asList(1,2,3,4,5,6,7);
  List<Integer> sortedNumbrs = numberr1.stream().sorted().collect(Collectors.toList());
  System.out.println(sortedNumbrs);
  System.out.println("---------------------------------------------------------");
  
  Set<Integer> squareSet  = numbers.stream().map(p -> p*p).collect(Collectors.toSet());
  System.out.println(squareSet);
  System.out.println("---------------------------------------------------------");
  
  numberr1.stream().map(p -> p*p).forEach(p -> System.out.println(p));
  System.out.println("---------------------------------------------------------");
  
  int even = numberr1.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i); 
  System.out.println(even);
  System.out.println("---------------------------------------------------------");
}
}
