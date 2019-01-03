package com.leavix.dao;

import com.leavix.domain.User;

import java.util.List;

public interface UserMapper {
    public User findUserByID(int id);
    public List<User> findAllUser();
    public void updateUser(User user);
    public void insertUser(User user);
}
