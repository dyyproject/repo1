package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

public interface UserService {
    public User findUserById(Integer id);
    public List<User> findAllUsers();
}
