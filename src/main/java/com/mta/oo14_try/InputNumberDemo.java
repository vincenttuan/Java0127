package com.mta.oo14_try;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

// 0~9 猜一數字
public class InputNumberDemo {
    private static int ans;
    static {
        ans = new Random().nextInt(10);
    }
    public static void play() {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入數字(0~9): ");
        try {
            int guess = sc.nextInt();
            if (guess > ans) {
                System.out.println("猜大了");
            } else if (guess < ans) {
                System.out.println("猜小了");
            } else {
                System.out.println("答對了");
                return; // 中止此方法(停止)
            }
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("請輸入數字~");
            //System.out.println("不給玩~");
            //return; // 中止此方法(停止)
        }
        play(); // 自己再次呼叫自己 (遞迴), 再繼續玩(猜)
    }
    
    public static void main(String[] args) {
        play();
    }
}
