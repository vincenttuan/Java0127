package oo15_test;

import com.mta.oo15_try.exception.UserFailLoginException;
import com.mta.oo15_try.exception.UserNotFoundException;
import com.mta.oo15_try.service.UserService;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    UserService us = new UserService();
    
    // 測試所有 User 資料
    @org.junit.Test
    public void t1() {
        System.out.println("測試所有 User 資料:");
        System.out.println(us.queryUsers());
    }
    
    // 測試登入
    @org.junit.Test
    public void t2() {
        String username = "john";
        String password = "1234";
        System.out.printf("測試登入 %s / %s:\n", username, password);
        try {
            boolean isOK = us.getUserLogin().check(username, password);
            System.out.printf("Login success: %b\n", isOK);
        } catch (UserFailLoginException ex) {
            System.out.println(ex.getMessage());
        } catch (UserNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    // 測試修改密碼
    @org.junit.Test
    public void t3() {
        String username = "john";
        String newPassword = "1111";
        System.out.printf("將 %s 的 密碼改為 %s\n", username, newPassword);
        try {
            us.updatePassword(username, newPassword);
        } catch (UserNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        t1(); // 查詢所有 User 資料
    }
    
    // 測試修改 Email
    @org.junit.Test
    public void t4() {
        String username = "john";
        String newEmail = "john@yahoo.com";
        System.out.printf("將 %s 的 Email改為 %s\n", username, newEmail);
        try {
            us.updateEmail(username, newEmail);
        } catch (UserNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        t1(); // 查詢所有 User 資料
    }
}
