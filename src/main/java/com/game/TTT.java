package com.game;

import static com.game.Util.print;
import java.util.Scanner;
public class TTT {
    public static void main(String[] args) {
        char[][] ttt = new char[3][3];
        //System.out.println(ttt[0][0] == '\u0000'); // '\u0000' 表示 char 的空值
        do {            
            // 遊戲進行
            print(ttt); // 取代 Util.print(ttt); 的用法
            Scanner sc = new Scanner(System.in);
            System.out.print("請輸入選項(1~9): ");
            int p = sc.nextInt();
            p -= 1;
            ttt[p/3][p%3] = 'O';
            
        } while (true);
        
    }
}
