package com.tesco.practice;

import java.util.ArrayList;
import java.util.List;

public class Mid {
public static void main(String[] args) {
  List<Integer> arr = new ArrayList<>();
  arr.add(1);
  arr.add(2);
  arr.add(3);
  arr.add(4);
  arr.add(5);
  arr.add(6);
  arr.add(7);
  arr.add(8);
  
  
  System.out.println(packArray(arr));
}

public static Integer packArray( List<Integer> arr ) {
  while(arr.size() > 1) {
    List<Integer> secondList = new ArrayList<Integer>();
    List<Integer> thirdList = new ArrayList<Integer>();
    
    for(int i=0; i<arr.size(); i=i+2){
      secondList.add(arr.get(i)+arr.get(i+1));
    }
    if(secondList.size() > 1) {
      for(int i=0; i< secondList.size();i= i+2){
        thirdList.add(secondList.get(i)*secondList.get(i+1));
      }
      arr = thirdList;
    }else {
      arr = secondList;
    }
    
  }
  return arr.get(0);
}
}
