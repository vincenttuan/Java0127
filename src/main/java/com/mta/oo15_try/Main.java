package com.mta.oo15_try;

import java.util.Scanner;

public class Main {
    public static void action(int n) {
        
    }
    
    public static void menu() {
        do {            
            System.out.println("------------------");
            System.out.println("1.Print all users");
            System.out.println("2.Print user");
            System.out.println("3.Update password");
            System.out.println("4.Update email");
            System.out.println("0.Exit");
            System.out.println("------------------");
            Scanner sc = new Scanner(System.in);
            System.out.print("==> ");
            int n = sc.nextInt();
            if(n == 0) {
                System.out.println("程式結束");
                break;
            }
            action(n);
        } while (true);
        
    }
    
    public static void main(String[] args) {
        menu();
    }
}
