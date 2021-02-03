package com.mta.oo15_try.service;

import com.mta.oo15_try.entity.User;
import com.mta.oo15_try.exception.UserNotFoundException;
import com.mta.oo15_try.util.UserUtil;
import java.text.SimpleDateFormat;
import java.util.List;

public class UserService {
    private UserLogin userLogin = new UserLogin();
    
    // 取得 UserLogin 物件
    public UserLogin getUserLogin() {
        return userLogin;
    }
    
    // 查詢所有 User
    public List<User> queryUsers() {
        return UserUtil.queryUsers();
    }
    
    // 查詢單筆 User, 根據 username
    public User getUser(String username) throws UserNotFoundException {
        return UserUtil.getUserByName(username);
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
    
    public void print() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("+----------+----------+--------------------+--------------------+");
        System.out.printf("|%-10s+%-10s+%-20s+%-20s|\n", "username", "password", "email", "tdate");
        System.out.println("+----------+----------+--------------------+--------------------+");
        for(User u : queryUsers()) {
            System.out.printf("|%-10s+%-10s+%-20s+%-20s|\n", 
                            u.getUsername(),
                            u.getPassword(),
                            u.getEmail(),
                            sdf.format(u.getTdate()));
            System.out.println("+----------+----------+--------------------+--------------------+");
        }
    }
}
