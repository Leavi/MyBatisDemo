package com.leavix.test;

import com.leavix.dao.UserDao;
import com.leavix.domain.User;
import org.junit.Test;

import java.util.List;

public class UserTest {
    @Test
    public void testFindUserByID(){
        UserDao userDao = new UserDao();
        User user = userDao.findUserByID(2);
        System.out.println(user.toString());
    }

    @Test
    public void testFindAllUser(){
        UserDao userDao = new UserDao();
        List<User> list = userDao.findAllUser();
        for (User user: list) {
            System.out.println(user.toString());
        }
    }

    @Test
    public void testUpdateUser(){
        UserDao userDao = new UserDao();
        User user = userDao.findUserByID(2);
        user.setPhone("15885456152");
        userDao.updateUser(user);
    }
}
