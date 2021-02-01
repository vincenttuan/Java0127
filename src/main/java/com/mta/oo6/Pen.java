package com.mta.oo6;

public class Pen {
   static String name = "鉛筆"; // (static)類別屬性
   int price;   // (non-static)物件屬性
   
   static void printName() { // (non-static)物件方法
       System.out.printf("name: %s\n", name);
   }
   
   void printPrice() { // (non-static)物件方法
       System.out.printf("price: %s\n", price);
   }
   
   static void printDM() {
       Pen pen = new Pen();
       pen.price = 10;
       // 鉛筆 10 元起~
       System.out.printf("%s %d 元起~\n", name, pen.price);
   }
   
   static void printDM(Pen pen) {
       // 鉛筆 10 元起~
       System.out.printf("%s %d 元起~\n", name, pen.price);
   }
   
}
