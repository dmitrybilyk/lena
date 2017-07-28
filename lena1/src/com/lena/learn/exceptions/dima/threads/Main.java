package com.lena.learn.exceptions.dima.threads;

/**
 * Created by dmitry on 28.07.17.
 */
public class Main {
    public static void main(String[] args) {
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("dfdsfsdfdsffgt3333");
//            }
//        });
//        t1.start();
        MyThread m = new MyThread();
        m.start();
    }
}
