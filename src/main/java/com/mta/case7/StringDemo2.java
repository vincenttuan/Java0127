package com.mta.case7;

public class StringDemo2 {
    public static void update(StringBuilder sb) {
        sb.append("8");
    }
    
    public static void update(String s) {
        s = s.concat("8");
    }
    
    public static String update2(String s2) {
        s2 = s2.concat("8");
        return s2;
    }
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        update(sb); // 呼叫程式第4行的方法
        System.out.println(sb);
        
        String s = "Java";
        update(s); // 呼叫程式第8行的方法
        System.out.println(s);
        
        String s2 = "Java";
        s2 = update2(s2); // 呼叫程式第12行的方法,並接收回傳的新字串
        System.out.println(s2);
    }
}
