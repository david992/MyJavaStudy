<%--
  Created by IntelliJ IDEA.
  User: win10
  Date: 2021/6/11
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
<form action="/student/addstudentservlet" method="get" autocomplete="off"><!--手动封装-->
    学生姓名：<input type="text" name="username" placeholder="请输入"><br/>
    学生年龄：<input type="number" name="age"><br/>
    学生成绩：<input type="number" name="grade"><br/>
    学生爱好：<input type="checkbox" name="hobbies" value="ball">打球
    <input type="checkbox" name="hobbies" value="studyy">学习<br/>
    <button type="submit">保存</button>
</form>
</body>
</html>
