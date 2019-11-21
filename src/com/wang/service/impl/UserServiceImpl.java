package com.wang.service.impl;

import com.wang.dao.UserDao;
import com.wang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    @Override
    public String getUserData() {
        return userDao.getUserData();
    }
}
