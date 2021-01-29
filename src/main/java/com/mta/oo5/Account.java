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

    public int getMoney() { // 查款
        return money;
    }
    
    // 一般方法
    public boolean withdrawMoney(int money) { // 提款
        if(money > 0 && this.money >= money) {
            this.money -= money;
            System.out.printf("%s 提款 $%d 成功\n", no, money);
            return true;
        }
        System.out.printf("%s 提款 $%d 失敗\n", no, money);
        return false;
    }

    public boolean depositMoney(int money) { // 存款
        if(money > 0) {
            this.money += money;
            System.out.printf("%s 存款 $%d 成功\n", no, money);
            return true;
        }
        System.out.printf("%s 存款 $%d 失敗\n", no, money);
        return false;
    }

    @Override
    public String toString() {
        return "Account{" + "no=" + no + ", money=" + money + '}';
    }
    
}
