package com.lena.learn.exceptions.dima;

public class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }

    public MyException(Throwable e) {
        initCause(e); 
    }

} 