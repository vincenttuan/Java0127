package com.mta.case5;

import java.util.Arrays;

public class MultiArrayDemo2 {
    public static void main(String[] args) {
        int[][] scores = {
            {100, 90, 0},
            {0, 80, 70}
        };
        // 如何將 0 變成 60
        scores[0][2] = 60;
        scores[1][0] = 60;
        System.out.println(Arrays.toString(scores[0]));
        System.out.println(Arrays.toString(scores[1]));
    }
}
