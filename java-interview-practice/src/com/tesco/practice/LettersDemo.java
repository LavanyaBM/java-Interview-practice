package com.tesco.practice;

public class LettersDemo {
public static void main(String[] args) {
  String str= "Lavanya";
  if(str!=null && !str.equals("") && str.chars().allMatch(Character::isLetter)) {
    System.out.println(true);
  }
}
}
