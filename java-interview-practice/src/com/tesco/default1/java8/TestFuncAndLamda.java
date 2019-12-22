package com.tesco.default1.java8;

public class TestFuncAndLamda {
  
  interface interFac1 {
    public int operate(int x, int y);
  }
  
  interface interFac2 {
    public void message(String msg);
  }

  public int test(int x, int y, interFac1 f) {
    return f.operate(x, y);
  }

  public static void main(String[] args) {
    interFac1 f1 = (a,b) -> a+b;
    interFac1 f2 = (a,b) -> a*b;
    
    TestFuncAndLamda obj = new TestFuncAndLamda();
    
    System.out.println(obj.test(1, 2, f1));
    
    System.out.println(obj.test(4, 2, f2));
    
    interFac2 f3 = (p) -> System.out.println(p);
  }
}
