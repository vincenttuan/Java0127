package com.mta.oo5;

import java.util.ArrayList;

// 工具類別
public class Util {
    
    // 所有帳戶的集合資料
    private static ArrayList<Account> accounts = new ArrayList<>();
    
    // 開戶
    public static void addAccount(String no, int money) {
        Account account = new Account(no, money);
        accounts.add(account);
    }
    
    // 提款
    public static void withdraw(String no, int money) {
        Account act = read(no);
        if(act == null) {
            System.out.printf("%s 帳號不存在\n", no);
            return;
        } 
        act.withdrawMoney(money);
    }
    
    // 存款
    public static void deposit(String no, int money) {
        Account act = read(no);
        if(act == null) {
            System.out.printf("%s 帳號不存在\n", no);
            return;
        } 
        act.depositMoney(money);
    }
    
    // 轉帳
    public static void deposit(String fromNo, String toNo, int money) {
        Account fromAct = read(fromNo);
        Account toAct = read(toNo);
        if(fromAct == null) {
            System.out.printf("%s 帳號不存在\n", fromNo);
            return;
        }
        if(toAct == null) {
            System.out.printf("%s 帳號不存在\n", toNo);
            return;
        }
        fromAct.transferMoney(money, toAct);
    }
    
    // 查詢帳戶
    public static Account read(String no) {
        for(Account act : accounts) {
            if(act.getNo().equals(no)) {
                return act;
            }
        }
        return null;
    }
    
    // 查詢全部帳戶
    public static ArrayList<Account> readAll() {
        return accounts;
    }
    
}
