package com.lena.learn.exceptions.io;

import java.io.File;
public class ReadDirectory {

   public static void main(String[] args) {
      File pathDir = null;
      String[] pathsFilesAndDir;
  
      try {      
         // Создание нового объекта file
         pathDir = new File("/home/dmitry/dev/projects/lena/lena1/src/com/lena/learn/exceptions/io/"); // Обязательно должен существовать указанный каталог на диске, иначе программа выдаст ошибку

         // Массив файлов и папок
         pathsFilesAndDir = pathDir.list();

         for(String path:pathsFilesAndDir) {
            // Вывод списка файлов и каталогов
            System.out.println(path);
         }
      }catch(Exception e) {
         // Если произошла ошибка
         e.printStackTrace();
      }
   } 
}