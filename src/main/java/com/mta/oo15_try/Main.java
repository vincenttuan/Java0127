package com.mta.oo15_try;

import com.mta.oo15_try.exception.UserFailLoginException;
import com.mta.oo15_try.exception.UserNotFoundException;
import com.mta.oo15_try.service.UserService;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void action(int n) {
        UserService us = new UserService();
        Scanner sc = new Scanner(System.in);
        String username = "";
        String password = "";
        String email = "";
        switch(n) {
            case 1:
                us.print();
                break;
            case 2:
                break;
            case 3:
                System.out.print("請輸入 username: ");
                username = sc.next();
                System.out.print("請輸入 password: ");
                password = sc.next();
                try {
                    boolean isOK = us.getUserLogin().check(username, password);
                    if(isOK) {
                        System.out.print("請輸入 new password: ");
                        String newPassword = sc.next();
                        us.updatePassword(username, newPassword);
                    }
                } catch (UserFailLoginException ex) {
                    System.out.println(ex.getMessage());
                } catch (UserNotFoundException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            case 4:
                System.out.print("請輸入 username: ");
                username = sc.next();
                System.out.print("請輸入 password: ");
                password = sc.next();
                try {
                    boolean isOK = us.getUserLogin().check(username, password);
                    if(isOK) {
                        System.out.print("請輸入 new Email: ");
                        String newEmail = sc.next();
                        us.updateEmail(username, newEmail);
                    }
                } catch (UserFailLoginException ex) {
                    System.out.println(ex.getMessage());
                } catch (UserNotFoundException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
        }
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

