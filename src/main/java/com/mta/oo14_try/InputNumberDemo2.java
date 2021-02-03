package com.mta.oo14_try;

import java.util.Scanner;

public class InputNumberDemo2 {
    
    public static void play() {
        int days = 365;
        Scanner sc = new Scanner(System.in);
        System.out.printf("分子是 %d 請輸入分母: ", days);
        int x = sc.nextInt();
        int result = days/x;
        System.out.printf("計算結果是: %d\n", result);
        System.out.print("是否要繼續(Y/N)? ");
        String goon = sc.next();
        if(goon.equalsIgnoreCase("y")) {
            play();
        } else {
            System.out.println("程式中止");
            return;
        }
    }
    
    public static void main(String[] args) {
        play();
    }
}
