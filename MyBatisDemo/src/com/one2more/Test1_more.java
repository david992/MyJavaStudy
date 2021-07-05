package com.one2more;

import com.bean.Card;
import com.bean.Classes;
import com.one2one.CardMapper;
import com.one2one.PersonMapper;
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
public class Test1_more {
    @Test
    public void selectAll() throws IOException {
        InputStream rs = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        sqlSessionFactory.getConfiguration().addMapper(ClassesMapper.class);
        sqlSessionFactory.getConfiguration().addMapper(StudentMapper.class);
        ClassesMapper mapper = sqlSession.getMapper(ClassesMapper.class);
        List<Classes> Classess = mapper.selectAll();
        for (Classes classes : Classess) {
            System.out.println(classes);
        }
        rs.close();
        sqlSession.close();
    }

}
