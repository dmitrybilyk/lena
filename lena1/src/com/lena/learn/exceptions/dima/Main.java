package com.lena.learn.exceptions.dima;

/**
 * Created by dmitry on 17.07.17.
 */
public class Main {
    public static void main(String[] args) {
//        try {
            doSomething();
//        } catch (MyCheckedException e) {
//            e.printStackTrace();
//        }
    }

    private static void doSomething() throws MyUnCheckedException {
//        throw new MyCheckedException();
        throw new OutOfMemoryError();
//        System.out.println("fdfdfdfd");
    }
}
