package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public User findUserById(Integer id) {
    return userDao.findUserById(id);
    }

    public List<User> findAllUsers() {
        return userDao.findAllUsers();
    }


}
