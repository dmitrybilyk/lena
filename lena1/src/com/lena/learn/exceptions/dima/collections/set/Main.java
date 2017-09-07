package com.lena.learn.exceptions.dima.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by dmitry on 02.09.17.
 */
public class Main {
    public static void main(String[] args) {
        Set<String> stringSet = new LinkedHashSet<String>();
        stringSet.add("1");
        stringSet.add("3");
        stringSet.add("2");
        stringSet.add("4");
        stringSet.add("5");
        stringSet.add("6");
        stringSet.add("7");
        for (String s : stringSet) {
            System.out.println(s);
        }
    }
}
