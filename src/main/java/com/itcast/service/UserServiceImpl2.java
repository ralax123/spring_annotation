package com.itcast.service;

import com.itcast.dao.UserDao;
import com.itcast.dao.UserDaoImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl2 implements UserService {
    private UserDao userDao = new UserDaoImpl();

    public void save() {
        System.out.println("222222222");
        userDao.save();
    }
}
