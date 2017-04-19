package com.example.service;

import com.example.dao.UserDao;
import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by NE1639 on 2017/4/18.
 */
@Component
public class UserService {
    @Autowired
    private UserDao userDao;
    public User getUserById(String id){
        return userDao.getUserById(id);
    }
}
