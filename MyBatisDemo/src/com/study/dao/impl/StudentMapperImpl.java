//package com.study.dao.impl;
//
//import com.study.demo.Student;
//import com.study.mapper.StudentMapper;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//
///**
// * @Program: MyJavaStudy
// * @ClassName: StudentMapperImpl
// * @Author: David_J
// * @Copyright David
// * @Date: 2021-06-28 18:05
// * @Version: V1.0
// */
//public class StudentMapperImpl implements StudentMapper {
//    /*
//    * 持久层接口实现类
//    * */
//    @Override
//    public List<Student> selectAll() {
//        List<Student> selectList = null;
//        InputStream rs = null;
//        SqlSession sqlSession = null;
//        try {
//            rs = Resources.getResourceAsStream("MyBatisConfig.xml");
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);
//            sqlSession = sqlSessionFactory.openSession(true);
//            selectList = sqlSession.selectList("StudentMapper.selectAll");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if (sqlSession != null){
//                sqlSession.close();
//            }
//            if(rs != null){
//                try {
//                    rs.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return selectList;
//    }
//
//    @Override
//    public Student selectById(Integer id) {
//        Student stu = null;
//        InputStream rs = null;
//        SqlSession sqlSession = null;
//        try {
//            rs = Resources.getResourceAsStream("MyBatisConfig.xml");
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);
//            sqlSession = sqlSessionFactory.openSession(true);
//            stu = sqlSession.selectOne("StudentMapper.selectById",id);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if (sqlSession != null){
//                sqlSession.close();
//            }
//            if(rs != null){
//                try {
//                    rs.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return stu;
//    }
//
//    @Override
//    public Integer insert(Student stu) {
//        Integer result = null;
//        InputStream rs = null;
//        SqlSession sqlSession = null;
//        try {
//            rs = Resources.getResourceAsStream("MyBatisConfig.xml");
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);
//            sqlSession = sqlSessionFactory.openSession(true);
//            result = sqlSession.insert("StudentMapper.insert",stu);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if (sqlSession != null){
//                sqlSession.close();
//            }
//            if(rs != null){
//                try {
//                    rs.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return result;
//    }
//
//    @Override
//    public Integer update(Student stu) {
//        Integer result = null;
//        InputStream rs = null;
//        SqlSession sqlSession = null;
//        try {
//            rs = Resources.getResourceAsStream("MyBatisConfig.xml");
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);
//            sqlSession = sqlSessionFactory.openSession(true);
//            result = sqlSession.insert("StudentMapper.update",stu);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if (sqlSession != null){
//                sqlSession.close();
//            }
//            if(rs != null){
//                try {
//                    rs.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return result;
//    }
//
//    @Override
//    public Integer delete(Integer id) {
//        Integer result = null;
//        InputStream rs = null;
//        SqlSession sqlSession = null;
//        try {
//            rs = Resources.getResourceAsStream("MyBatisConfig.xml");
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);
//            sqlSession = sqlSessionFactory.openSession(true);
//            result = sqlSession.insert("StudentMapper.delete",id);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if (sqlSession != null){
//                sqlSession.close();
//            }
//            if(rs != null){
//                try {
//                    rs.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return result;
//
//    }
//}
