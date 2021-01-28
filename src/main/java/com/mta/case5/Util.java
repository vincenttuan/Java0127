package com.mta.case5;

import java.util.Arrays;

public class Util {
    public static double[][] reverse(double [][] values) {
        double[][] rvalues = new double[values[0].length][values.length];
        for(int i=0;i<rvalues.length;i++) {
            //rvalues[i][0] = values[0][i];
            //rvalues[i][1] = values[1][i];        
            for(int k=0;k<rvalues[i].length;k++) {
                rvalues[i][k] = values[k][i];
            }
        }
        return rvalues;
    }
    
    public static void print(double [][] array) {
        for(double[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
