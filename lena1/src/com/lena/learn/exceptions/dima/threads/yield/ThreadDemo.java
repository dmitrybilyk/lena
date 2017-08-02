package com.lena.learn.exceptions.dima.threads.yield;

import java.lang.*;

public class ThreadDemo implements Runnable {

   Thread t;

   ThreadDemo(String str, int priority) {

      t = new Thread(this, str);
      t.setPriority(priority);
      // this will call run() function
      t.start();
   }

   public void run() {

      int count = 0;
      for (int i = 0; i < 510000; i++) {
         // yields control to another thread every 5 iterations
         if ((i % 5) == 0) {
            count++;
            System.out.println(Thread.currentThread().getName() +
            "yielding control...");

            /* causes the currently executing thread object to temporarily 
            pause and allow other threads to execute */
//            Thread.yield();
         }
      }

      System.out.println(Thread.currentThread().getName() + " has finished executing." + count);
   }

   public static void main(String[] args) {
      new ThreadDemo("Thread 1", Thread.MIN_PRIORITY);
      new ThreadDemo("Thread 2", Thread.MIN_PRIORITY);
      new ThreadDemo("Thread 3", Thread.MAX_PRIORITY);
   }
}