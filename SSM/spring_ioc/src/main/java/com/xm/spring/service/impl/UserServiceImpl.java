package com.xm.spring.service.impl;

import com.xm.spring.dao.UserDao;
import com.xm.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void savaUser() {
        userDao.saveUser();
    }
}
