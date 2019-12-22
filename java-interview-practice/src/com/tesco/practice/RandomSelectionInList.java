package com.tesco.practice;

import java.util.ArrayList;
import java.util.Random;

public class RandomSelectionInList {
public static void main(String[] args) {
  ArrayList<Integer> list = new ArrayList<>();
  list.add(1);
  list.add(2);
  list.add(3);
  list.add(4);
  list.add(5);
  
  RandomSelectionInList r = new RandomSelectionInList();
  System.out.println(r.printRandom(list));
  System.out.println(r.printRandom(list));
  System.out.println(r.printRandom(list));
  System.out.println(r.printRandom(list));
  System.out.println(r.printRandom(list));
  
}

private int printRandom(ArrayList<Integer> list) {
  Random  r = new Random();
  return list.get(r.nextInt(list.size()));
}
}
