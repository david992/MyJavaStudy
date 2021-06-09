package com.responseservlet.demo;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

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
@WebServlet("/ServletDemo03")
public class ServletDemo03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建字节输入流对象 关联读取的文件
        String realPath = getServletContext().getRealPath("/img/18040.jpg");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(realPath));
        //设置响应头类型
        resp.setHeader("Content-Type","application-octet-stream");
        //设置响应头以下载方式打开
        resp.setHeader("Content-Disposition","attachment;filename=test.jpg");
        //获取字节输出流对象
        ServletOutputStream os = resp.getOutputStream();
        //循环读写
        byte[] arr = new byte[1024];
        int len;
        while((len = bis.read(arr)) !=-1 ){
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
