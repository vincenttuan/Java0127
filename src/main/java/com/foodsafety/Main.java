package com.foodsafety;

public class Main {
    public static void main(String[] args) {
        String name = "御皇有機白米";
        System.out.printf("%10s %10s %10s %s\n", "品名", "檢驗結果", "行政處分", "不合格原因");
        System.out.println("-----------------------------------------------------");
        Rice[] badRices = Util.queryBadRices();
        print(badRices, name);
        Rice[] goodRices = Util.queryGoodRices();
        print(goodRices, name);
    }
    public static void print(Rice[] rices, String name) {
        for(Rice r : rices) {
            if(r.get品名().contains(name)) {
                System.out.printf("%-10s %-10s %-10s %s\n", 
                        r.get品名().replace("\n", ""), 
                        r.get檢驗結果().replace("\n", ""), 
                        r.get行政處分() != null ? r.get行政處分().replace("\n", "") : "", 
                        r.get不合格原因() != null ? r.get不合格原因().replace("\n", "") : "");
            }
        }
    }
}
