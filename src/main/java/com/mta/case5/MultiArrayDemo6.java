package com.mta.case5;

public class MultiArrayDemo6 {
    public static void main(String[] args) {
        double[][] values = {
            {160.5, 170, 180.5}, // 身高
            {56, 60, 72}, // 體重
        };
        // 陣列反轉
        double[][] rvalues = Util.reverse(values);
        Util.print(rvalues);
    }
    
    
    
}
