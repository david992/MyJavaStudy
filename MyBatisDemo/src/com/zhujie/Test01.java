package com.zhujie;

import com.bean.Students;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: Test01
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-02 17:02
 * @Version: V1.0
 */
public class Test01 {
    @Test
    public void selectAll() throws IOException {
        InputStream rs = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentsMapper mapper = sqlSession.getMapper(StudentsMapper.class);
        List<Students> students = mapper.selectAll();
        for (Students student : students) {
            System.out.println(student);
        }
        rs.close();
        sqlSession.close();
    }
    @Test
    public void insert() throws IOException {
        InputStream rs = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        StudentsMapper mapper = sqlSession.getMapper(StudentsMapper.class);
        Integer jinx = mapper.insert(new Students(5, 25, "Jinx"));
        System.out.println(jinx);
        rs.close();
        sqlSession.close();
    }
    @Test
    public void update() throws IOException {
        InputStream rs = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        StudentsMapper mapper = sqlSession.getMapper(StudentsMapper.class);
        Integer jinx = mapper.update(new Students(5, 998, "JinxQwQ"));
        System.out.println(jinx);
        rs.close();
        sqlSession.close();
    }

    @Test
    public void delete() throws IOException {
        InputStream rs = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        StudentsMapper mapper = sqlSession.getMapper(StudentsMapper.class);
        Integer jinx = mapper.delete(5);
        System.out.println(jinx);
        rs.close();
        sqlSession.close();
    }
}
