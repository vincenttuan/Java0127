package com.mta.case5;

import java.util.Arrays;

public class MultiArrayDemo {
    public static void main(String[] args) {
        int[][] scores = new int[2][3];
        scores[0][1] = 100;
        scores[1][2] = 90;
        System.out.println(Arrays.toString(scores[0]));
        System.out.println(Arrays.toString(scores[1]));
    }
}
