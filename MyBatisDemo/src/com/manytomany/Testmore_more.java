package com.manytomany;

import com.bean.Classes;
import com.bean.Students;
import com.one2more.ClassesMapper;
import com.one2more.StudentMapper;
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
public class Testmore_more {
    @Test
    public void selectAll() throws IOException {
        InputStream rs = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        sqlSessionFactory.getConfiguration().addMapper(CourseMapper.class);
        sqlSessionFactory.getConfiguration().addMapper(StudentsMapper.class);
        StudentsMapper mapper = sqlSession.getMapper(StudentsMapper.class);
        List<Students> Students = mapper.selectAll();
        for (Students Student : Students) {
            System.out.println(Student);
        }
        rs.close();
        sqlSession.close();
    }

}
