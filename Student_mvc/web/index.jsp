<%--
  Created by IntelliJ IDEA.
  User: win10
  Date: 2021/6/11
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>学生管理系统</title>
  </head>
  <body>
<% Object username = session.getAttribute("username");
  if (username == null){
%>
    <a href="/student/login.jsp">请登录</a>
  <% }else{%>
    <a href="/student/addstudent.jsp">添加学生</a>
    <a href="/student/liststudentservlet">查看学生</a>

  <% } %>
  </body>
</html>
