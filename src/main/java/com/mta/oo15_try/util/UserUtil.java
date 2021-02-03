package com.mta.oo15_try.util;

import com.mta.oo15_try.entity.User;
import java.util.ArrayList;
import java.util.List;

public class UserUtil {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        users.add(new User("john", "1234", "john@gmail.com"));
        users.add(new User("mary", "5678", "mary@gmail.com"));
        users.add(new User("helen", "0000", "helen@gmail.com"));
    }
    
    public static List<User> queryUsers() {
        return users;
    }
    
    public static User getUserByName(String username) {
        User user = null;
        for(User u : queryUsers()) {
            if(u.getUsername().equals(username)) {
                user = u;
                break;
            }
        }
        return user;
    }
}
