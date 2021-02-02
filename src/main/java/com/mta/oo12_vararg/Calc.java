package com.mta.oo12_vararg;

public class Calc {
    public int add(int... values) {
        int sum = 0;
        for(int x : values) {
            sum += x;
        }
        return sum;
    }
}
