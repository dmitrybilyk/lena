package com.lena.learn.exceptions.dima.applet;

import java.applet.Applet;
import java.awt.Graphics;
 
public class HelloApplet extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawString("Hello, world!",0,50);
    }
}