package com.game;

import java.util.Arrays;

public class Util {

    public static void print(char[][] ttt) {
        for (char[] t : ttt) {
            System.out.println(Arrays.toString(t));
        }
    }

    public static boolean gameOver(char[][] ttt) {
        for (char[] tt : ttt) {
            for (char t : tt) {
                if (t == '\u0000') {
                    return false;
                }
            }
        }
        return true;
    }
}
