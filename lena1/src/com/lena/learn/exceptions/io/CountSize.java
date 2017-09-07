package com.lena.learn.exceptions.io;

import java.io.File;

/**
 * Created by dmitry on 07.09.17.
 */
public class CountSize {
    static int size = 0;
    public static void main(String[] args) {

        java.io.File baseDir = null;
        String[] pathsFilesAndDir;

        try {
            // Создание нового объекта file
            baseDir = new java.io.File("/home/dmitry/dev/projects/lena/lena1/src/com/lena/learn/exceptions/io"); // Обязательно должен существовать указанный каталог на диске, иначе программа выдаст ошибку
            int size = getSize(baseDir);
            System.out.println(size  );
        }catch(Exception e) {
            // Если произошла ошибка
            e.printStackTrace();
        }
    }

    private static int getSize(File baseDir) {
        for (File file : baseDir.listFiles()) {
            if (file.isFile()) {
                size += file.length();
            } else if (file.isDirectory()){
                getSize(file);
            }
        }
        return size;
    }
}
