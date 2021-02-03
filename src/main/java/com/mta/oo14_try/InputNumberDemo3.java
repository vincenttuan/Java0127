package com.mta.oo14_try;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumberDemo3 {
    
    public static void play() {
        int days = 365;
        Scanner sc = new Scanner(System.in);
        System.out.printf("分子是 %d 請輸入分母: ", days);
        // --------------------------------------------------------
        try {
           int x = sc.nextInt();
           int result = days/x;
           System.out.printf("計算結果是: %d\n", result);
           
        } //注意: 使用 | 來捕捉例外錯誤, 例外類別間不可有繼承關係
        catch (InputMismatchException | ArithmeticException e) { 
            System.out.println(e);
            System.out.println("錯誤原因:請輸入數字或分母不可 = 0");
            sc = new Scanner(System.in); // 重新取得 Scanner 物件
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("產生其他的錯誤~");
            return;
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
