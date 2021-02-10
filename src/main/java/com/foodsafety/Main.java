package com.foodsafety;

public class Main {
    public static void main(String[] args) {
        String name = "日本";
        Rice[] rices = Util.queryRices();
        System.out.printf("%10s %10s %10s %s\n", "品名", "檢驗結果", "行政處分", "不合格原因");
        System.out.println("-----------------------------------------------------");
        for(Rice r : rices) {
            if(r.get品名().contains(name)) {
                System.out.printf("%-10s %-10s %-10s %s\n", 
                        r.get品名(), r.get檢驗結果(), r.get行政處分(), r.get不合格原因());
            }
        }
    }
}
