package com.mta.oo12_vararg;

public class CalcMain {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.add(1, 3));
        int[] values = {1, 3};
        System.out.println(calc.add(values));
        System.out.println(calc.add(1, 3, 5, 7));
        System.out.println(calc.add(1));
        System.out.println(calc.add());
    }
}

