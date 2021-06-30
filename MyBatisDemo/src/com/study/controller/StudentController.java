package com.study.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.study.demo.Student;
import com.study.mapper.StudentMapper;
import com.study.service.StudentService;
import com.study.service.impl.StudentServiceImpl;
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
 * @ClassName: StudentTest01
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-23 11:58
 * @Version: V1.0
 */
public class StudentController {
    /*
    * 控制层测试类
    * */

    //创建业务层对象
    private StudentService service = new StudentServiceImpl();
    @Test
    public void selectAll() {
        List<Student> stus = service.selectAll();
        for (Student student : stus) {
            System.out.println(student);
        }

    }
    @Test
    public void selectById()  {
        Student stu = service.selectById(1);
        System.out.println(stu);

    }
    @Test
    public void insert()  {
        Student hang = new Student(6, "hang", 25);
        Integer insert = service.insert(hang);
        System.out.println(insert);
    }

    @Test
    public void update()  {

        Student hang = new Student(6, "xu----hang", 25);
        Integer update = service.update(hang);
        System.out.println(update);
    }
    @Test
    public void delete()  {
        Integer delete = service.delete(6);
        System.out.println(delete);

    }
    @Test
    public void selectCondition(){
        Student hang = new Student( );
        hang.setAge(12);
        hang.setName("啊啊啊啊");
        //hang.setId(1);
        List<Student> students = service.selectCondition(hang);
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void selectByIds(){
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        List<Student> students = service.selectByIds(list);
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void selectPaging() {
        InputStream rs = null;
        SqlSession sqlSession = null;
        List<Student> student = null;
        try {
            //加载核心配置文件
            rs = Resources.getResourceAsStream("MyBatisConfig.xml");
            //获取sqlsession工厂对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);
            //获取selsession对象
            sqlSession = sqlSessionFactory.openSession(true);
            //获取studentmapper接口的实现类对象
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

            //通过分页助手实现分页
            PageHelper.startPage(1,2);
            PageHelper.startPage(2,2);
            PageHelper.startPage(3,2);
            student = mapper.selectAll();



        } catch (IOException e) {
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
        for (Student student1 : student) {
            System.out.println(student1);
        }
        //获取分页相关参数
        PageInfo<Student> info = new PageInfo<>(student);
        System.out.println("总条数："+info.getTotal());
        System.out.println("总页数："+info.getPages());
        System.out.println("当前页："+info.getPageNum());
        System.out.println("每页条数："+info.getPageSize());
        System.out.println("上一页："+info.getPrePage());
        System.out.println("下一页："+info.getNextPage());
        System.out.println("是否是第一页："+info.isIsFirstPage());
        System.out.println("是否最后一页："+info.isIsLastPage());
    }
}
