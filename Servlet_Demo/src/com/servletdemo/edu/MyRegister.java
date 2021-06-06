package com.servletdemo.edu;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.Set;

/**
 * @author David
 * @Title:
 * @Package
 * @Description:
 * @date 2021/6/617:44
 * 注册配置Servlet功能类
 */
public class MyRegister implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        //完成servlet
        // 对象创建
        MyHttpServlet2 myHttpServlet2 = new MyHttpServlet2();
        ServletRegistration.Dynamic servletdemo02 = servletContext.addServlet("servletdemo02", myHttpServlet2);
        servletdemo02.addMapping("/servletdemo2");
        servletdemo02.setLoadOnStartup(1);
    }
}
