package com.lena.learn.exceptions.io;

import java.io.*;
public class FileCopyByteStream {

   public static void main(String args[]) throws IOException {  
      FileInputStream fileIn = null;
      FileOutputStream fileOut = null;

      try {
         fileIn = new FileInputStream("/home/dmitry/dev/projects/lena/lena1/src/com/lena/learn/exceptions/io/file.txt");
         fileOut = new FileOutputStream("/home/dmitry/dev/projects/lena/lena1/src/com/lena/learn/exceptions/io/copied_file.txt");
         
         int a;
         // Копирование содержимого файла file.txt
         while ((a = fileIn.read()) != -1) {
            fileOut.write(a); // Чтение содержимого файла file.txt и запись в файл copied_file.txt
         }
      }finally {
         if (fileIn != null) {
            fileIn.close();
         }
         if (fileOut != null) {
            fileOut.close();
         }
      }
   }
}