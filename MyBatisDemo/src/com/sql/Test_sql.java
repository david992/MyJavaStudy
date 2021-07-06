package com.sql;

import com.bean.Course;
import com.bean.Students;
import com.zhujie.StudentsMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: Test01
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-02 17:02
 * @Version: V1.0
 */
public class Test_sql {
    @Test
    public void selectAll() throws IOException {
        InputStream rs = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSessionFactory.getConfiguration().addMapper(com.sql.StudentMapper.class);
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
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
        sqlSessionFactory.getConfiguration().addMapper(com.sql.StudentMapper.class);

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
//        ArrayList<Course> course = new ArrayList<>();
//        course.add(new Course(1,"语文"));
        Integer jinx = mapper.insert(new Students(null, 25, "david"));
        System.out.println(jinx);
        rs.close();
        sqlSession.close();
    }
    @Test
    public void update() throws IOException {
        InputStream rs = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        sqlSessionFactory.getConfiguration().addMapper(com.sql.StudentMapper.class);
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Integer jinx = mapper.update(new Students(7, 30, "david"));
        System.out.println(jinx);
        rs.close();
        sqlSession.close();
    }

    @Test
    public void delete() throws IOException {
        InputStream rs = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        sqlSessionFactory.getConfiguration().addMapper(com.sql.StudentMapper.class);

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Integer jinx = mapper.delete(5);
        System.out.println(jinx);
        rs.close();
        sqlSession.close();
    }
}
