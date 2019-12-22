package com.tesco.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Anymatcdemo {
  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(5, 4, 9, 7);
    boolean result = list.stream().anyMatch(p -> p * (p + 1) / 4 == 5);
    System.out.println(result);
    System.out.println("-------------------------------------------------------");
    
    List<String> names = Arrays.asList("Lav", "Sun", "Thrini", "Hari");
    boolean result1 = names.stream().anyMatch(str -> Character.isUpperCase(str.charAt(0)));
    System.out.println(result1);
    System.out.println("-------------------------------------------------------");
    
    Stream<String> stream = Stream.of("C", "C++", "Jav", "DS");
    boolean result2 = stream.noneMatch(p -> p.length() == 4);
    System.out.println(result2);
    System.out.println("-------------------------------------------------------");
    
    Stream<Integer> stream1 = Stream.of(3, 4, 2, 7);
    boolean result3 = stream1.noneMatch(p -> p < 3);
    System.out.println(result3);
    System.out.println("-------------------------------------------------------");

    Stream<String> stream2 = Stream.of("Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks", "CSe");
    boolean result4 = stream2.noneMatch(p -> Character.isUpperCase(p.charAt(0))
        && Character.isLowerCase(p.charAt(1)) && p.charAt(0) == 'f');
    System.out.println(result4);
    System.out.println("-------------------------------------------------------");
    
    List<String> list1 = Arrays.asList("25", "225", "1000", "20", "15");
    list1.stream().mapToLong(num -> Long.parseLong(num)).filter(p -> Math.sqrt(p) / 5 == 3)
        .forEach(System.out::println);
    System.out.println("-------------------------------------------------------");
    
    List<String> list2 =
        Arrays.asList("Data Structures", "JAVA", "OOPS", "GeeksforGeeks", "Algorithms");
    list2.stream().mapToLong(str -> Long.bitCount(str.length())).forEach(System.out::println);
    System.out.println("-------------------------------------------------------");
    
    List<Integer> list3 = Arrays.asList(2, 4, 6, 8);
    Optional<Integer> result5 = list3.stream().findAny();
    if (result5.isPresent()) {
      System.out.println(result5.get());
    } else {
      System.out.println("no value");
    }
    System.out.println("-------------------------------------------------------");
    
    Optional<String> result6 = names.stream().findAny();
    if(result6.isPresent()) {
      System.out.println(result6.get());
    }else {
      System.out.println("No value");
    }
    System.out.println("-------------------------------------------------------");
    
    IntStream intStream = IntStream.of(2,4,6,8).parallel();
    intStream = intStream.filter(p -> p%2 ==0);
    OptionalInt ans = intStream.findAny();
    if(ans.isPresent()) {
      System.out.println(ans.getAsInt());
    }
    System.out.println("-------------------------------------------------------");
    
    list3.stream().forEachOrdered(System.out::println);
    System.out.println("-------------------------------------------------------");
    
    list2.stream().forEachOrdered(System.out::println);
    System.out.println("-------------------------------------------------------");
    
    Stream<String> stream3 = Stream.of("GFG", "Geeks", "for", "GeeksforGeeks");
    stream3.flatMap(p -> Stream.of(p.charAt(2))).forEachOrdered(System.out::println);
    System.out.println("-------------------------------------------------------");
  }
}
