package com.tesco.practice;

public class JVMShutDownHook {
public static void main(String[] args) {
  System.out.println("shutdown hook demo");
  Runtime.getRuntime().addShutdownHook(new Thread() {
    public void run() {
      System.out.println("Shutdown hook is running");
    }
  });
  System.out.println("application thread is running");
}
}
