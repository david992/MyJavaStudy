package com.study.dao;

import com.study.demo.Student;
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
 * @ClassName: StudentTest01
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-23 11:58
 * @Version: V1.0
 */
public class StudentTest01 {
    @Test
    public void selectAll() throws IOException {
        //加载核心配置文件
        InputStream rs = Resources.getResourceAsStream("MyBatisConfig.xml");

        //获取sqlsession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);


        //通过工厂对象获取sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //执行映射配置文件中语句 接收结果
        List<Student> list = sqlSession.selectList("StudentMapper.selectAll");

        //处理结果
        for (Student student : list) {
            System.out.println(student);
        }
        //释放资源
        rs.close();
    }


}
