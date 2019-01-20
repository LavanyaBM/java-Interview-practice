package com.tesco.lamda;

public class ConstructorReference {
  public static void main(String[] args) {
    Messageable msg = Message::new;
    msg.message("Lav's you are unique");
  }
}
