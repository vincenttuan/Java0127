package com.mta.oo5;

public class Account {
    private String no; // 帳號
    private int money; // 餘額

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
    
    // 轉帳
    public void transferMoney(int money, Account act) {
        System.out.println("轉帳開始");
        if(withdrawMoney(money)) { // 自己把錢提出來 !
            act.depositMoney(money); // 把錢存進去給 act 物件
        }
        System.out.println("轉帳結束");
    }

    @Override
    public String toString() {
        return "Account{" + "no=" + no + ", money=" + money + '}';
    }
    
}
