package com.exam;

import java.util.Scanner;

public class Exam40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String data = sc.next();
            System.out.println("印出使用者所輸入的內容: " + data);
            if(data.equalsIgnoreCase("exit")) {
                break;
            }
            
        }
    }
}
