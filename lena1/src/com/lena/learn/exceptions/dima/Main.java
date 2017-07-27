package com.lena.learn.exceptions.dima;

import java.util.ArrayList;

/**
 * Created by dmitry on 17.07.17.
 */
public class Main {
    public static void main(String[] args) {
        try {
//            try{
//                doSomething();
            doStackOverFlow();

            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
//            } catch (MyCheckedException e) {
//                System.out.println(e.getMessage());
            }
//            doSomething();
//        } catch (MyCheckedException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//        System.out.println(doSomething());
//        } catch (MyCheckedException e) {
//            e.printStackTrace();
//        }
    }

    private static void doStackOverFlow() {
        doStackOverFlow();
    }

    private static void doSomething() throws MyCheckedException {
//        throw new MyCheckedException();
//        throw new OutOfMemoryError();
//        int i = 10;
//        if (ifIIsGood(i)) {
//            return;
//        }
        printSomething();
        Long l = 0l;
        l = getaLong(l);
        System.out.println(l);
        throw new MyCheckedException("ttttt");
//        return;
//        System.out.println("fdfdfdfd");
    }

    private static boolean ifIIsGood(int i) {
        return i > 0 && i > 5;
    }

    private static Long getaLong(Long l) {
        try {
            l = Long.parseLong("55");
        } catch (NumberFormatException ne) {
            System.out.println(ne.getClass().getCanonicalName() + " " + ne.getMessage());
        }
        return l;
    }

    private static void printSomething() {
        System.out.println("Lena");
        System.out.println("Lena1");
        System.out.println("Lena2");
    }

    private static Student doDima() {
        return new Student();
    }
}
