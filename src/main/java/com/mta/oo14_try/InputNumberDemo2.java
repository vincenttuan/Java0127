package com.mta.oo14_try;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumberDemo2 {
    
    public static void play() {
        int days = 365;
        Scanner sc = new Scanner(System.in);
        System.out.printf("分子是 %d 請輸入分母: ", days);
        // --------------------------------------------------------
        try {
           int x = sc.nextInt();
           int result = days/x;
           System.out.printf("計算結果是: %d\n", result);
           
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("請輸入數字~");
            sc = new Scanner(System.in); // 重新取得 Scanner 物件
        } catch (ArithmeticException e2) {
            System.out.println(e2);
            System.out.println("分母不可 = 0");
            sc = new Scanner(System.in); // 重新取得 Scanner 物件
        }
        // --------------------------------------------------------
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
