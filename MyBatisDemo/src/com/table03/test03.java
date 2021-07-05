package com.table03;

import com.bean.Classes;
import com.bean.Course;
import com.bean.Students;
import com.table02.OneToMoreMapper;
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
 * @ClassName: test01
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-01 14:47
 * @Version: V1.0
 */
public class test03 {
    @Test
    public void selectAll() {
    InputStream rs = null;
    SqlSession sqlSession = null;
    List<Students> list = null;
        try {
        //加载核心配置文件
        rs = Resources.getResourceAsStream("MyBatisConfig.xml");
        //获取sqlsession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);
        //获取selsession对象
        sqlSession = sqlSessionFactory.openSession(true);
        //获取OneToOneMapper接口的实现类对象

        ManyToManyMapper mapper = sqlSession.getMapper(ManyToManyMapper.class);

//        通过分页助手实现分页
//        PageHelper.startPage(1,2);
//        PageHelper.startPage(2,2);
//        PageHelper.startPage(3,2);
        list = mapper.selectAll();



    } catch (
    IOException e) {
        e.printStackTrace();
    } finally {
        if (sqlSession != null) {
            sqlSession.close();
        }
        if (rs != null) {
            try {
                rs.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
        for (Students student : list) {
        System.out.println(student.getId()+","+student.getAge()+","+student.getName());
            List<Course> course = student.getCourse();
            for (Course course1 : course) {
                System.out.println(course1);
            }
        }
}
}
