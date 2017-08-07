package com.lena.learn.exceptions.dima.strings;

import com.lena.learn.exceptions.dima.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by dmitry on 04.08.17.
 */
public class Strings {
    private static final String SPACE = " ";
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("gedit");
            p.waitFor();
        } catch (Exception e) {
            System.out.println("error");
        }
        System.out.println(p.exitValue());
//        Student student = new Student();
//        Student student1 = new Student();
//        System.out.println(student == student1);
//
//        String s1 = "Hello";
//        String s2 = new String(s1);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1 == s2);

//
//        List<String> stringList = new ArrayList<String>();
//        stringList.add("Lena");
//        stringList.add("Dima");
//
//
//        Collections.sort(stringList);
//
//        for (String s : stringList) {
//            System.out.println(s);
//        }

//        String s = "DimaLena";
//        System.out.println(s.toLowerCase());


    }
}
