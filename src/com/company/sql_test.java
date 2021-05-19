package com.company;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Program: test
 * @ClassName: sql_test
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-04-16 11:49
 * @Version: V1.0
 */
public class sql_test {
    public static final String DBDRICER = "com.mysql.cj.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/fruit";
    public static final String DBUSER = "root";
    public static final String DBPASS = "123456";

    public static void main(String[] args){
        Statement stmt = null;
        Connection conn = null;
        try{
            // 注册 JDBC 驱动
            // 把Driver类装载进jvm
            Class.forName(DBDRICER);

            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
            System.out.println("实例化Statement对象");

            stmt = conn.createStatement();
            String  sql = "select * from goods_type";
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            System.out.println(rs.getString(1));
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
