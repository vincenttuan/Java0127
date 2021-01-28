package com.mta.case5;

import java.util.Arrays;

public class MultiArrayDemo5 {
    public static void main(String[] args) {
        double[][] values = {
            {160.5, 170, 180.5}, // 身高
            {56, 60, 72}, // 體重
        };
        // 求這三人的 bmi 值 = ?
        // 陣列反轉
        /*
            {
                {160.5, 170, 180.5},
                {56, 60, 72}
            }
            變成
            {
                {160.5, 56},
                {170, 60},
                {180.5, 72},
            }
        */
        //double[][] rvalues = new double[3][2];
        double[][] rvalues = new double[values[0].length][values.length];
        for(int i=0;i<rvalues.length;i++) {
            //rvalues[i][0] = values[0][i];
            //rvalues[i][1] = values[1][i];        
            for(int k=0;k<rvalues[i].length;k++) {
                rvalues[i][k] = values[k][i];
            }
        }
        
        print(rvalues);
    }
    
    public static void print(double [][] array) {
        for(double[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
    
}
