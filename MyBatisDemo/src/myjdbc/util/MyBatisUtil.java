package myjdbc.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @Program: MyJavaStudy
 * @ClassName: qq
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-08-07 10:55
 * @Version: V1.0
 */
public class MyBatisUtil {
    public static SqlSessionFactory sqlSessionFactory = null;
    static{
        Reader reader = null;
        try{
            reader = Resources.getResourceAsReader("MyBatisConfig.xml");
        }catch (IOException e){
            e.printStackTrace();
            //初始化遇到错误时，将异常抛给调用者
            throw new ExceptionInInitializerError(e);
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader) ;

    }
    //定义返回SqlSession对象的方法
    public static SqlSession openSession(){
        return sqlSessionFactory.openSession();
    }
    //释放SqlSession对象
    public static void closeSession(SqlSession session){
        if (session != null) {
            session.close();
        }
    }
}
