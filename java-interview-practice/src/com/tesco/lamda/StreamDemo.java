package com.tesco.lamda;

import java.util.stream.Stream;

public class StreamDemo {
public static void main(String[] args) {
  Stream.iterate(2, element -> element+1).filter(p -> p%5 == 0).limit(5).forEach(System.out::println);
  Stream.iterate(1, element -> element+2).filter(p -> p%5 == 0).limit(5).forEach(System.out::println);
}
}
