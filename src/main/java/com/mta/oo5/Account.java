package com.mta.oo5;

public class Account {
    private String no;
    private int money;

    public Account(String no, int money) {
        this.no = no;
        this.money = money;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" + "no=" + no + ", money=" + money + '}';
    }
    
}
