package com.studentservlet;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.PropertyDescriptor;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * @author David
 * @Title:
 * @Package
 * @Description:
 * @date 2021/6/722:50
 */
@WebServlet("/addstudentservlet04")
public class StudentServlet04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //字符流
        BufferedReader br = req.getReader();
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }

        //字节流 万能的流
        ServletInputStream is = req.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read()) != -1){
            System.out.println(new String(bytes,0,len));

        }

    }

    private void method2(Map<String, String[]> parameterMap, Student stu) {
        for(String key: parameterMap.keySet()){
            String[] values = parameterMap.get(key);
            PropertyDescriptor pd = null;
            try {
                //获取student对象的属性描述器
                pd = new PropertyDescriptor(key, stu.getClass());
                //获取对于setfangfa
                Method writeMethod = pd.getWriteMethod();
                //执行方法
                if(values.length>1){
                    writeMethod.invoke(stu,(Object) values);
                }else{
                    writeMethod.invoke(stu,values);
                }
            } catch ( Exception e) {
                e.printStackTrace();
            }

        }
    }

    private void method1(HttpServletRequest req) {
        String username = req.getParameter("username");
        String age = req.getParameter("age");
        String grade = req.getParameter("grade");
        String[] hobbies = req.getParameterValues("hobby");
        Student student = new Student(username,age,grade,hobbies);
        System.out.println(student);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
