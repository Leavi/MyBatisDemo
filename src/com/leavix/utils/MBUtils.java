package com.leavix.utils;

import com.leavix.dao.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MBUtils {
    static String resource = "config/MyBatisConfig.xml";
    static Reader reader;
    static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            reader = Resources.getResourceAsReader(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }

    public static void closeSqlSession(SqlSession sqlSession){
        sqlSession.close();
    }
}
