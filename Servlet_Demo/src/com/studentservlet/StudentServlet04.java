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



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
