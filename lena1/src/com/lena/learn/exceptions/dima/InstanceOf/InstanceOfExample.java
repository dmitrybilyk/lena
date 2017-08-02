package com.lena.learn.exceptions.dima.InstanceOf;

import com.lena.learn.exceptions.dima.Student;
import com.lena.learn.exceptions.dima.SubClass;

/**
 * Created by dmitry on 01.08.17.
 */
public class InstanceOfExample {

    public static void main(String[] args) {
        Student student = new Student();
        doInstanceOf(student);

    }

    private static void doInstanceOf(Object object) {
        if (object instanceof SubClass) {
            System.out.println("subclass");
        } else if (object instanceof Student) {
            System.out.println("student");
        }
    }
}
