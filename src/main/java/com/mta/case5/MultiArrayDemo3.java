package com.mta.case5;

import java.util.Arrays;

public class MultiArrayDemo3 {
    public static void main(String[] args) {
        char[][] ttt = {
            {'X', 'O', 'X'},
            {'O', 'O', 'X'},
            {'X', ' ', ' '},
        };
        int p = 7;
        ttt[p/3][p%3] = 'O';
        System.out.println(Arrays.toString(ttt[0]));
        System.out.println(Arrays.toString(ttt[1]));
        System.out.println(Arrays.toString(ttt[2]));
    }
}
