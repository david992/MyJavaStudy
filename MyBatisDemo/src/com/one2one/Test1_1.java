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
//        加载核心配置文件
        InputStream rs = Resources.getResourceAsStream("MyBatisConfig.xml");
//        获取sqlsession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);
//        通过工厂对象获取sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//        获取接口实体类对象
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
