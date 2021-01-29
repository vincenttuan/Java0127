package com.mta.oo5;

import java.util.Scanner;

public class ATM2 {
    private static boolean play = true;
    
    public static void main(String[] args) {
        while (play) {            
            menu();
        }
    }
    
    public static void menu() {
        System.out.println("----------------");
        System.out.println("1. 開戶");
        System.out.println("2. 存款");
        System.out.println("3. 提款");
        System.out.println("4. 轉帳");
        System.out.println("5. 查詢");
        System.out.println("0. 離開");
        System.out.println("----------------");
        service();
    }
    
    public static void service() {
        Scanner sc = new Scanner(System.in);
        System.out.print("==> ");
        int n = sc.nextInt();
        switch(n) {
            case 1: // 開戶
                System.out.print("請輸入開戶帳號: ");
                String newNo = sc.next();
                System.out.print("請輸入開戶金額: ");
                int newMoney = sc.nextInt();
                // 調用開戶方法
                Util.addAccount(newNo, newMoney);
                break;
            case 2: // 存款
                System.out.print("請輸入存款帳號: ");
                String depositNo = sc.next();
                System.out.print("請輸入存款金額: ");
                int depositMoney = sc.nextInt();
                // 調用存款方法
                Util.deposit(depositNo, depositMoney);
                break;
            case 3: // 提款
                System.out.print("請輸入提款帳號: ");
                String withdrawNo = sc.next();
                System.out.print("請輸入提款金額: ");
                int withdrawMoney = sc.nextInt();
                // 調用提款方法
                Util.withdraw(withdrawNo, withdrawMoney);
                break;
            case 4: // 轉帳
                break;
            case 5: // 查詢
                System.out.print("請輸入查詢帳號或輸入[all]看全部: ");
                String readNo = sc.next();
                // 調用查詢方法
                if(readNo.equals("all")) {
                    System.out.println(Util.readAll());
                } else {
                    System.out.println(Util.read(readNo));
                }
                break;
            case 0: // 離開
                play = false;
                break;
        }
    }
}

