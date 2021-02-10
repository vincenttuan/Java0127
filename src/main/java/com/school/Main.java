package com.school;

import java.util.Scanner;

public class Main {
    private static boolean exit; // 預設 false
    public static void main(String[] args) {
        while (!exit) {
            menu();
        }
    }
    public static void menu() {
        System.out.println("------------------------------------");
        System.out.println("1. 列出所有班級");
        System.out.println("2. 列出所有學生");
        System.out.println("3. 列出所有班級(含學生)");
        System.out.println("4. 列出所有學生(含班級)");
        System.out.println("5. 單筆查詢指定班級(含學生)");
        System.out.println("6. 單筆查詢指定學生(含班級)");
        System.out.println("0. 離開");
        System.out.println("------------------------------------");
        action();
    }
    
    public static void action() {
        Scanner sc = new Scanner(System.in);
        System.out.print("請選擇 ==> ");
        int no = sc.nextInt();
        switch(no) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 0:
                exit = true;
                System.out.println("離開本系統~");
                break;
        }
    }
}
