package com.game;

import java.util.Arrays;

public class Util {

    public static void print(char[][] ttt) {
        for (char[] tt : ttt) {
            System.out.println(Arrays.toString(tt));
        }
    }

    public static boolean gameOver(char[][] ttt) {
        // who win ?
        char[] marks = {'O', 'X'};
        for (char mark : marks) {
            boolean[] checks = new boolean[8];
            checks[0] = ttt[0][0] == mark && ttt[0][1] == mark && ttt[0][2] == mark;
            checks[1] = ttt[1][0] == mark && ttt[1][1] == mark && ttt[1][2] == mark;
            checks[2] = ttt[2][0] == mark && ttt[2][1] == mark && ttt[2][2] == mark;
            checks[3] = ttt[0][0] == mark && ttt[1][0] == mark && ttt[2][0] == mark;
            checks[4] = ttt[0][1] == mark && ttt[1][1] == mark && ttt[2][1] == mark;
            checks[5] = ttt[0][2] == mark && ttt[1][2] == mark && ttt[2][2] == mark;
            checks[6] = ttt[0][0] == mark && ttt[1][1] == mark && ttt[2][2] == mark;
            checks[7] = ttt[0][2] == mark && ttt[1][1] == mark && ttt[2][0] == mark;
            for (boolean check : checks) {
                if (check) {
                    System.out.printf("%s Win !\n", mark=='O'?"User":"PC");
                    return true; // 遊戲結束
                }
            }
        }

        // 沒有空格 ?
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
