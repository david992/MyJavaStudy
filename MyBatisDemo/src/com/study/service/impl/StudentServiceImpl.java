package com.study.service.impl;

import com.study.demo.Student;
import com.study.mapper.StudentMapper;
//import com.study.dao.impl.StudentMapperImpl;
import com.study.service.StudentService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: StudentMapperImpl
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-28 18:05
 * @Version: V1.0
 * 业务层
 */
public class StudentServiceImpl implements StudentService {
    /*
     * 业务层实现类，业务层调用持久层功能，所以需要创建持久层对象
     */

//    创建持久层对象
//    private StudentMapper mapper = new StudentMapperImpl();

    @Override
    public List<Student> selectAll() {
//        return mapper.selectAll();
        InputStream rs=null;
        SqlSession sqlSession = null;
        List<Student> students =null;
        try {
            //加载核心配置文件
            rs = Resources.getResourceAsStream("MyBatisConfig.xml");
            //获取sqlsession工厂对象
            SqlSessionFactory sqlSessionFactory  = new SqlSessionFactoryBuilder().build(rs);
            //获取selsession对象
            sqlSession = sqlSessionFactory.openSession(true);
            //获取studentmapper接口的实现类对象
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            students = mapper.selectAll();

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (sqlSession != null){
                sqlSession.close();
            }
            if(rs != null){
                try {
                    rs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return students;
    }

    @Override
    public Student selectById(Integer id) {
//        return mapper.selectById(id);
        InputStream rs=null;
        SqlSession sqlSession = null;
        Student student =null;
        try {
            //加载核心配置文件
            rs = Resources.getResourceAsStream("MyBatisConfig.xml");
            //获取sqlsession工厂对象
            SqlSessionFactory sqlSessionFactory  = new SqlSessionFactoryBuilder().build(rs);
            //获取selsession对象
            sqlSession = sqlSessionFactory.openSession(true);
            //获取studentmapper接口的实现类对象
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            student = mapper.selectById(id);

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (sqlSession != null){
                sqlSession.close();
            }
            if(rs != null){
                try {
                    rs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return student;
    }

    @Override
    public Integer insert(Student stu) {
//        return mapper.insert(stu);

        InputStream rs=null;
        SqlSession sqlSession = null;
        Integer result =null;
        try {
            //加载核心配置文件
            rs = Resources.getResourceAsStream("MyBatisConfig.xml");
            //获取sqlsession工厂对象
            SqlSessionFactory sqlSessionFactory  = new SqlSessionFactoryBuilder().build(rs);
            //获取selsession对象
            sqlSession = sqlSessionFactory.openSession(true);
            //获取studentmapper接口的实现类对象
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            result = mapper.insert(stu);

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (sqlSession != null){
                sqlSession.close();
            }
            if(rs != null){
                try {
                    rs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

    @Override
    public Integer update(Student stu) {
//        return mapper.update(stu);

        InputStream rs=null;
        SqlSession sqlSession = null;
        Integer result =null;
        try {
            //加载核心配置文件
            rs = Resources.getResourceAsStream("MyBatisConfig.xml");
            //获取sqlsession工厂对象
            SqlSessionFactory sqlSessionFactory  = new SqlSessionFactoryBuilder().build(rs);
            //获取selsession对象
            sqlSession = sqlSessionFactory.openSession(true);
            //获取studentmapper接口的实现类对象
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            result = mapper.update(stu);

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (sqlSession != null){
                sqlSession.close();
            }
            if(rs != null){
                try {
                    rs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

    @Override
    public Integer delete(Integer id) {
//        return mapper.delete(id);

        InputStream rs=null;
        SqlSession sqlSession = null;
        Integer result =null;
        try {
            //加载核心配置文件
            rs = Resources.getResourceAsStream("MyBatisConfig.xml");
            //获取sqlsession工厂对象
            SqlSessionFactory sqlSessionFactory  = new SqlSessionFactoryBuilder().build(rs);
            //获取selsession对象
            sqlSession = sqlSessionFactory.openSession(true);
            //获取studentmapper接口的实现类对象
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            result = mapper.delete(id);

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (sqlSession != null){
                sqlSession.close();
            }
            if(rs != null){
                try {
                    rs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

    @Override
    public List<Student> selectCondition(Student stu) {

        InputStream rs=null;
        SqlSession sqlSession = null;
        List<Student> students =null;
        try {
            //加载核心配置文件
            rs = Resources.getResourceAsStream("MyBatisConfig.xml");
            //获取sqlsession工厂对象
            SqlSessionFactory sqlSessionFactory  = new SqlSessionFactoryBuilder().build(rs);
            //获取selsession对象
            sqlSession = sqlSessionFactory.openSession(true);
            //获取studentmapper接口的实现类对象
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            students = mapper.selectCondition(stu);

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (sqlSession != null){
                sqlSession.close();
            }
            if(rs != null){
                try {
                    rs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return students;
    }

    @Override
    public List<Student> selectByIds(List<Integer> ids) {

        InputStream rs=null;
        SqlSession sqlSession = null;
        List<Student> students =null;
        try {
            //加载核心配置文件
            rs = Resources.getResourceAsStream("MyBatisConfig.xml");
            //获取sqlsession工厂对象
            SqlSessionFactory sqlSessionFactory  = new SqlSessionFactoryBuilder().build(rs);
            //获取selsession对象
            sqlSession = sqlSessionFactory.openSession(true);
            //获取studentmapper接口的实现类对象
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            students = mapper.selectByIds(ids);

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (sqlSession != null){
                sqlSession.close();
            }
            if(rs != null){
                try {
                    rs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return students;    }
}
