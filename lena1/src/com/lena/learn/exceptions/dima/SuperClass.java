package com.lena.learn.exceptions.dima;

import java.io.IOException;

public class SuperClass {
    public void start() throws Exception {
        throw new IOException("Not able to open file"); 
    } 
} 