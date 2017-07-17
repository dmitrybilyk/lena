package com.lena.learn.exceptions;

//import java.util.logging.Logger;

/**
 * Created by dmitry on 17.07.17.
 */
public class Test1 {
    public static void main(String[] args) {

        int result = 0;

        try{
            result = getAreaValue(-1, 100);
        }catch(IllegalArgumentException e){
//            Logger.getLogger(NewClass.class.getName()).log(new LogRecord(Level.WARNING, "В метод вычисления площади был передан аргумент с негативным значением!"));
            throw e;
        }
        System.out.println("Result is : "+result);
    }

    public static int getAreaValue(int x, int y){
        if(x < 0 || y < 0) throw new IllegalArgumentException("value of 'x' or 'y' is negative: x="+x+", y="+y);
        return x*y;
    }
}
