package com.mta.oo15_try.service;

import com.mta.oo15_try.entity.User;
import com.mta.oo15_try.exception.UserNotFoundException;
import com.mta.oo15_try.util.UserUtil;

public class UserLogin {
    public boolean check(String username, String password) {
        try {
            // 1. 是否有此人 ?
            User user = UserUtil.getUserByName(username);
            // 2. 比對 password
            if(user.getPassword().equals(password)) {
                System.out.println("登入成功");
                return true;
            }
        } catch (UserNotFoundException ex) {
            System.out.printf("登入失敗: %s\n", ex.getMessage());
            return false; // 查無此人
        }
        System.out.println("登入失敗: 密碼錯誤");
        return false; // 密碼錯誤
    }
}
