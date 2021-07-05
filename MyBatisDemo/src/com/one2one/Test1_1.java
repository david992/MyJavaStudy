package com.one2one;

import com.bean.Card;
import com.bean.Students;
import com.zhujie.StudentsMapper;
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
public class Test1_1 {
    @Test
    public void selectAll() throws IOException {
        InputStream rs = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        sqlSessionFactory.getConfiguration().addMapper(CardMapper.class);
        sqlSessionFactory.getConfiguration().addMapper(PersonMapper.class);
        CardMapper mapper = sqlSession.getMapper(CardMapper.class);
        List<Card> Cards = mapper.selectAll();
        for (Card Card : Cards) {
            System.out.println(Card);
        }
        rs.close();
        sqlSession.close();
    }

}
