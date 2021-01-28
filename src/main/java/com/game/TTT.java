package com.game;

import static com.game.Util.print;
import java.util.Random;
import java.util.Scanner;
public class TTT {
    public static void main(String[] args) {
        Random r = new Random();
        char[][] ttt = new char[3][3];
        //System.out.println(ttt[0][0] == '\u0000'); // '\u0000' 表示 char 的空值
        do {            
            // User 遊戲進行
            print(ttt); // 取代 Util.print(ttt); 的用法
            Scanner sc = new Scanner(System.in);
            System.out.print("請輸入選項(1~9): ");
            int p = sc.nextInt();
            p -= 1;
            ttt[p/3][p%3] = 'O'; // 將 O 填入
            // PC 遊戲進行
            do {                
                p = r.nextInt(9); // 0~8
                // 判斷 ttt[p/3][p%3] 是否是 '\u0000'
            } while (ttt[p/3][p%3] != '\u0000');
            ttt[p/3][p%3] = 'X'; // 將 X 填入
            
        } while (true);
        
    }
}
