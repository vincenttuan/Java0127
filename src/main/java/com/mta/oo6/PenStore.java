package com.mta.oo6;

public class PenStore {
    public static void main(String[] args) {
        Pen p1= new Pen();
        Pen p2= new Pen();
        
        p2.name = "原子筆";
        p1.price = 10;
        p2.price = 20;
        
        Pen.printName();
        p1.printPrice();
        p2.printPrice();
        
        Pen.printDM();
        Pen.printDM(p1);
        
    }
}
