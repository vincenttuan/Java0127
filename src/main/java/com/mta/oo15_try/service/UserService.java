package com.mta.oo15_try.service;

import com.mta.oo15_try.entity.User;
import com.mta.oo15_try.exception.UserNotFoundException;
import com.mta.oo15_try.util.UserUtil;

public class UserService {
    private UserLogin userLogin = new UserLogin();
    
    public UserLogin getUserLogin() {
        return userLogin;
    }
    
    public void updatePassword(String username, String newPassword) throws UserNotFoundException {
        // 是否有此人
        User user = UserUtil.getUserByName(username);
        // 修改 user's password
        user.setPassword(newPassword);
        System.out.println("User password 修改完畢");
    }
    
    public void updateEmail(String username, String newEmail) throws UserNotFoundException {
        // 是否有此人
        User user = UserUtil.getUserByName(username);
        // 修改 user's email
        user.setEmail(newEmail);
        System.out.println("User password 修改完畢");
    }
}
