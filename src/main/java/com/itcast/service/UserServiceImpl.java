package com.itcast.service;

import com.itcast.dao.UserDao;
import com.itcast.dao.UserDaoImpl;
import org.springframework.stereotype.Service;

@Service("userService1")
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    public void save() {
        userDao.save();
    }
}
