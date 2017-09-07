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
        Student student = new Student();
        System.out.println(student.getClass().getSuperclass());
    }
}
