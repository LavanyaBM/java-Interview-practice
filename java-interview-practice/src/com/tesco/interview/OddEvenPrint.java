package com.tesco.interview;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class OddEvenPrint {
  
  boolean odd;
  int count = 1;
  int MAX = 20;
  
  public void printOdd() {
    synchronized (this) {
      while(count < MAX) {
        while(!odd) {
          System.out.println("odd waiting" +count);
          try {
            wait();
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
          System.out.println("notified odd" + count);
        }
        System.out.println("odd thread" + count);
        count++;
        odd = false;
        notify();
      }
    }
  }

  public void printEven() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    synchronized (this) {
      while(count < MAX) {
        while(odd) {
          System.out.println("Even waiting"+count);
          try {
            wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println("notified even" + count);
        }
        System.out.println("Even thread" +count);
        count++;
        odd = true;
        notify();
      }
      
    }
  }
  public static void main(String[] args) {
    OddEvenPrint oep = new OddEvenPrint();
    oep.odd = true;
    Thread t1 = new Thread(new Runnable() {
      
      @Override
      public void run() {
        oep.printEven();
      }
    });
 Thread t2 = new Thread(new Runnable() {
      
      @Override
      public void run() {
        oep.printOdd();
      }
    });
    t1.start();
    t2.start();
    try {
      t1.join();
      t2.join();
    }catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
}
