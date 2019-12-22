package com.tesco.practice;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DAteTimeFir {
public static void main(String[] args) {
  String inputValue = "2019-02-03T22:00:00.000Z";
  Instant timestamp = Instant.parse(inputValue);
  ZonedDateTime losAngelesTime = timestamp.atZone(ZoneId.of("Europe/London"));
  System.out.println(losAngelesTime);
  
  System.out.println(Instant.parse(inputValue).atZone(ZoneId.of("Europe/London")).toString().substring(11, 16));
  
  
}
}
