package com.mta.oo5;

public class ATM {
    public static void main(String[] args) {
        Account act1 = new Account("A01", 1000);
        Account act2 = new Account("B02", 1000);
        
        act1.depositMoney(500);
        System.out.println(act1);
        act1.withdrawMoney(300);
        System.out.println(act1);
        // 轉帳
        act1.transferMoney(750, act2);
        System.out.println(act1);
        System.out.println(act2);
        
    }
}
