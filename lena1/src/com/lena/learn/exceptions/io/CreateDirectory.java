package com.lena.learn.exceptions.io;

import java.io.File;
public class CreateDirectory {

   public static void main(String args[]) {
      String nameDir = "/home/dmitry/dev/projects/lena/lena1/src/com/lena/learn/exceptions/io/java/proglang/newdir2";
      File a = new File(nameDir);
      
      // Создание на диске папки и всех вышестоящих каталогов
      a.mkdirs();
   }
}