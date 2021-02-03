package oo15_test;

import com.mta.oo15_try.exception.UserFailLoginException;
import com.mta.oo15_try.exception.UserNotFoundException;
import com.mta.oo15_try.service.UserService;

public class Test {
    UserService us = new UserService();
    
    @org.junit.Test
    public void t1() {
        // 測試所有 User 資料
        System.out.println("測試所有 User 資料:");
        System.out.println(us.queryUsers());
    }
    @org.junit.Test
    public void t2() {
        // 測試登入
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
}
