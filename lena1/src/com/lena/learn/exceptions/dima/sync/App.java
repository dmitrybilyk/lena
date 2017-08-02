package com.lena.learn.exceptions.dima.sync;

public class App {

    public static void main(String[] args) throws InterruptedException {

        SynchronizedMethodClass example1 = new SynchronizedMethodClass();

        System.out.println("**** Synchronized Method example*****");

        Thread thread1 = new Thread(new SyncMethodRunnable(example1, "1"));
        Thread thread2 = new Thread(new SyncMethodRunnable(example1, "2"));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("List 1 is: " + example1.getNums1()
                + " /Position 1: " + example1.getPos1()
                + "\n");

    }
}