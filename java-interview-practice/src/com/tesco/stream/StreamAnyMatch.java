package com.tesco.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAnyMatch {
public static void main(String[] args) {
  List<Integer> list = Arrays.asList(1,2,3,4,5,6);
  boolean result = list.stream().anyMatch(p -> (p*(p+1)/4 == 5));
  System.out.println(result);
  
  Stream<String> stream = Stream.of("LAV", "Kav", "Sun", "Thrini", "Hari");
  boolean res = stream.anyMatch(str -> Character.isUpperCase(str.charAt(1)));
  System.out.println(res);
  
  boolean res1 = list.stream().noneMatch(p -> p.SIZE==4);
  System.out.println(res1);
}
}
