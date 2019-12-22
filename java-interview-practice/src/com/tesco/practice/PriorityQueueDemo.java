package com.tesco.practice;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class PriorityQueueDemo {
public static void main(String[] args) {
  PriorityQueue q = new PriorityQueue();
  q.add(12);
  q.add(3);
  q.add(3);
  q.add(7);
  
  while(!q.isEmpty()) {
    System.out.println(q.poll());
    q.remove();
  }
 System.out.println("------------"); 
  while(!q.isEmpty()) {
    System.out.println(q.element());
  }
  
  TreeSet<String> tree = new TreeSet<>();
  tree.add("Geeks");
  tree.add("for");
  tree.add("Geeks");
  tree.add("GeeksforGeeks");
  
  for(String tmp : tree) {
    System.out.println(tmp);
  }
  
  
  Set<String> s = new HashSet()
      {
    {
      add("Lav");
      add("Kav");
      add("L11av");
      add("L1av");
      add("La1v");
      add("Lav2");
    }
      };
      
      for (String string : s) {
        System.out.println(string);
      }
      
}
}
