package com.mta.oo6;

public class Pen {
   String name; // (non-static)物件屬性
   int price;   // (non-static)物件屬性
   
   void printName() { // (non-static)物件方法
       System.out.printf("name: %s\n", name);
   }
   
   void printPrice() { // (non-static)物件方法
       System.out.printf("price: %s\n", price);
   }
   
}
