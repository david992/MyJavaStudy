package com.responseservlet.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Program: MyJavaStudy
 * @ClassName: ServletDemo01
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-09 16:18
 * @Version: V1.0
 */

/*
字节流响应消息
* */
@WebServlet("/ServletDemo01")
public class ServletDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码格式
        //resp.setContentType("text/html;charset=UTF-8");
//        //获取字节流输出对象
//        ServletOutputStream os = resp.getOutputStream();
//        //字符串转字符数组 str.getBytes()
//        String str = "hello world";
//        os.write(str.getBytes());
//
//        //获取字符流输出对象
//        PrintWriter writer = resp.getWriter();
//        String str1 = "字符流输出对象";
//        writer.write(str1);

        //设置缓存 1个小时
        resp.setDateHeader("Expires",System.currentTimeMillis()+(1*60*60*100));
        //定时刷新
        resp.setHeader("Refresh","3;URL=/Servlet_Demo_war_exploded/addStudent.html");
        //响应图片
        System.out.println("收到请求");
        //根据相对路径回去绝对路径
        ServletContext servletContext = getServletContext();
        String realPath = servletContext.getRealPath("/img/18040.jpg");
        System.out.println(realPath);
        //System.out.println(servletContext.getAttribute("username"));
        //创建字节输入流对象，关联图片路径
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(realPath));
        //通过响应对象获得字节输出流对象
        ServletOutputStream os = resp.getOutputStream();
        byte[] arr = new byte[1024];
        int len ;
        //循环读写
        while ((len = bis.read(arr))!= -1 ){
            os.write(arr,0,len);
        }
        //释放资源
        bis.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         doPost(req, resp);
    }
}
