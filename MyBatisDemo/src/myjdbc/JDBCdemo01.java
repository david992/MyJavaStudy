package myjdbc;

import java.sql.*;

/**
 * @Program: MyJavaStudy
 * @ClassName: JDBCdemo01
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-06 16:30
 * @Version: V1.0
 */
public class JDBCdemo01 {
    public static void main(String[] args) throws  Exception {
        //1.导入jar包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //3.获取连接
        /*
        * DriverManager 驱动管理对象
        * */
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fruit", "root", "123456");

        //4.获取执行者对象

        Statement stmt = conn.createStatement();
        //5.执行sql语句并接收结果
        String sql = "select * from student";
        ResultSet rs = stmt.executeQuery(sql);

        //6.处理结果6
        while(rs.next()){
            System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+rs.getString("age"));
        }
        //7.释放资源
        stmt.close();
        conn.close();

    }
}
