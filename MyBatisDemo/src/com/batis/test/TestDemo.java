package com.batis.test;

import myjdbc.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Connection;

/**
 * @Program: MyJavaStudy
 * @ClassName: TestDemo
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-08-07 11:26
 * @Version: V1.0
 */
public class TestDemo {
    @Test
    public void testMyBatisUtils() throws Exception {
        SqlSession sqlSession = null;
        try {
            //一句话完成SqlSession的初始化工作
            sqlSession = MyBatisUtil.openSession();
            //执行数据库操作
            //sqlSession.insert()
            //sqlSession.update()
            Connection connection = sqlSession.getConnection();
            System.out.println(connection);
        } catch (Exception e) {
            throw e;
        } finally {
            //关闭数据连接
            MyBatisUtil.closeSession(sqlSession);
        }
    }
}
