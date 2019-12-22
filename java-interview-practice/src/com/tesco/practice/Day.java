package com.tesco.practice;

import java.time.LocalDate;

public class Day {
  
  public static void main(String[] args) {
    String date1 = "2019-03-13";
    String day = LocalDate.parse(date1).getDayOfWeek().toString();
    System.out.println(day);
  }

}
