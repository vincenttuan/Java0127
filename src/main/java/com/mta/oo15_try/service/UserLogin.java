package com.mta.oo15_try.service;

import com.mta.oo15_try.entity.User;
import com.mta.oo15_try.exception.UserFailLoginException;
import com.mta.oo15_try.exception.UserNotFoundException;
import com.mta.oo15_try.util.UserUtil;

class UserLogin {

    public boolean check(String username, String password) throws UserFailLoginException, UserNotFoundException {
        // 1. 是否有此人 ?
        User user = UserUtil.getUserByName(username);
        // 2. 比對 password
        if (user.getPassword().equals(password)) {
            System.out.println("登入成功");
            // 3. 登入成功
            return true; 
        }
        // 3. 登入失敗
        UserFailLoginException e = new UserFailLoginException("登入失敗: 密碼錯誤");
        throw e;
    }
}
