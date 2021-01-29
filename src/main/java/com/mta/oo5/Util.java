package com.mta.oo5;

import java.util.ArrayList;

// 工具類別
public class Util {
    // 所有帳戶的集合資料
    private static ArrayList<Account> accounts = new ArrayList<>();
    
    // 開戶
    public void addAccount(String no, int money) {
        Account account = new Account(no, money);
        accounts.add(account);
    }
    
    // 提款
    public void withdraw(String no, int money) {
        
    }
    
    // 存款
    public void deposit(String no, int money) {
        
    }
    
    // 轉帳
    public void deposit(String fromNo, String toNo, int money) {
        
    }
    
    // 查詢帳戶
    public Account read(String no) {
        for(Account act : accounts) {
            if(act.getNo().equals(no)) {
                return act;
            }
        }
        return null;
    }
    
    // 查詢全部帳戶
    public ArrayList<Account> readAll() {
        return accounts;
    }
    
}
