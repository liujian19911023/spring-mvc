package com.example.dao;

import com.example.pojo.User;
import org.springframework.stereotype.Component;

/**
 * Created by NE1639 on 2017/4/18.
 */
@Component
/**
 * Hibernate 连接postgresql
 */
public class UserDaoImpl implements  UserDao {
    public User getUserById(String id) {
        return null;
    }

    public void deleteUserById(String id) {

    }

    public void saveUser(User user) {

    }

    public void updateUser(User user) {

    }
}
