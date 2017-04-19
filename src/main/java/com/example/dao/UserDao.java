package com.example.dao;

import com.example.pojo.User;

/**
 * Created by NE1639 on 2017/4/18.
 */
public interface UserDao {
    User getUserById(String id);
    void deleteUserById(String id);
    void saveUser(User user);
    void updateUser(User user);
}
