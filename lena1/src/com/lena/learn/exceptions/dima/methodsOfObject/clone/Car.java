package com.lena.learn.exceptions.dima.methodsOfObject.clone;

import java.io.Serializable;

/**
 * Created by dmitry on 14.08.17.
 */
public class Car implements Serializable{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
