package com.lena.learn.exceptions.io;

import java.io.*;
public class FileCopySymbStream {

   public static void main(String args[]) throws IOException {
      FileReader fileIn = null;
      FileWriter fileOut = null;

      try {
         fileIn = new FileReader("/home/dmitry/dev/projects/lena/lena1/src/com/lena/learn/exceptions/io/file.txt");
         fileOut = new FileWriter("/home/dmitry/dev/projects/lena/lena1/src/com/lena/learn/exceptions/io/copied_file_symb.txt");
         
         int a;
         while ((a = fileIn.read()) != -1) {
            fileOut.write(a);
         }
      } finally {
         if (fileIn != null) {
            fileIn.close();
         }
         if (fileOut != null) {
            fileOut.close();
         }
      }
   }
}