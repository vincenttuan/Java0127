package com.mta.oo10;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        Director director = new Director();
        // 配置資源
        employee.salary = 5_0000;
        manager.salary = 7_0000;
        manager.budget = 15_0000;
        director.salary = 20_0000;
        director.budget = 30_0000;
        director.stockOptions = 50_0000;
        // 建立陣列 (多型陣列)
        Employee[] employees = {employee, manager, director};
        // 取得所有薪資 salary
        int sum = 0;
        for(Employee emp : employees) {
            sum += emp.salary;
        }
        System.out.printf("Salary: $%,d\n", sum);
        // 取得所有預算 budget
        int sum2 = 0;
        for(Employee emp : employees) {
            // emp -> 可能是 Employy, Manager, Director 其中之一
            if(emp instanceof Manager) { // 檢查 emp 是不是 Manager
                Manager mgr = (Manager)emp; // 轉型成 Manager
                sum2 += mgr.budget;
            }
        }
        System.out.printf("Budget: $%,d\n", sum2);
        // 取得所有股票選擇權 stockOptions
        int sum3 = 0;
        for(Employee emp : employees) {
            if(emp instanceof Director) {
                Director dir = (Director)emp;
                sum3 += dir.stockOptions;
            }
        }
        System.out.printf("StockOptions: $%,d\n", sum3);
        // 取得所有 salary, budget 與 stockOptions 的總和 ?
        int sum4 = 0;
        
        System.out.printf("Total: $%,d\n", sum4);
    }
}
