package com.lena.learn.exceptions.dima.sync.syncblock;

public class App {

    public static void main(String[] args) throws InterruptedException {

        SynchronizedBlockClass example2 = new SynchronizedBlockClass();
    	
        System.out.println("**** Synchronized Block example*****");
        
        Thread syncMethodThread1 = new Thread(new SyncBlockRunnable(example2, "1"));
        Thread syncMethodThread2 = new Thread(new SyncBlockRunnable(example2, "2"));
        
        syncMethodThread1.start();
        syncMethodThread2.start();
        
        syncMethodThread1.join();
        syncMethodThread2.join();

        System.out.println("List 2 is: " + example2.getNums2()
        				+ " /Position 2: " + example2.getPos2()
        				+ " / counter : " + example2.getCounter());
        
    }
}