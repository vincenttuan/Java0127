package com.mta.oo12_vararg;

public class Calc {
    public int add(int x, int y) {
        return x + y;
    }
    public int add(int x, int y, int z) {
        return x + y + z;
    }
    public int add(int[] values) {
        int sum = 0;
        for(int x : values) {
            sum += x;
        }
        return sum;
    }
}
