package com.lena.learn.exceptions.dima;

import java.io.IOException;

public class SubClass extends SuperClass{
    public void start() throws IOException {
        try {
            throw new MyCheckedException("Not able to start");
        } catch (MyCheckedException e) {
            e.printStackTrace();
        }
    } 
} 