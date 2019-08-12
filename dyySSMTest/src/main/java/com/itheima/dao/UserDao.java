package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface UserDao {
    public User findUserById(Integer id);
    public List<User> findAllUsers();
    public void addUser(User user);
}
