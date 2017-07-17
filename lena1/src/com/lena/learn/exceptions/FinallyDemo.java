package com.lena.learn.exceptions;

class FinallyDemo {
    static void procA() { 
        try { 
            System.out.println("inside procA"); 
            throw new RuntimeException("demo"); 
        } finally { 
            System.out.println("procA's finally"); 
        } 
    } 
    static void procB() { 
        try { 
            System.out.println("inside procB"); 
            return; 
        } finally { 
            System.out.println("procB's finally"); 
        } 
    } 
    public static void main(String args[]) { 
        try { 
            procA(); 
        } catch (Exception e) { 
        } 
        procB(); 
    } 
} 