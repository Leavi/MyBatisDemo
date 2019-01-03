package com.leavix.dao;

import com.leavix.domain.User;
import com.leavix.utils.MBUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDao implements UserMapper{

    @Override
    public User findUserByID(int id){
        SqlSession sqlSession = MBUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findUserByID(id);
        MBUtils.closeSqlSession(sqlSession);
        return user;
    }

    @Override
    public List<User> findAllUser(){
        SqlSession sqlSession = MBUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.findAllUser();
        MBUtils.closeSqlSession(sqlSession);
        return userList;
    }

    @Override
    public void updateUser(User user) {
        SqlSession sqlSession = MBUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateUser(user);
        sqlSession.commit();
        MBUtils.closeSqlSession(sqlSession);
    }

    @Override
    public void insertUser(User user) {
        SqlSession sqlSession = MBUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.insertUser(user);
        sqlSession.commit();
        MBUtils.closeSqlSession(sqlSession);
    }
}
