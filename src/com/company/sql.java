package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class sql {
    public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/fruit?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    public static final String DBUSER = "root";
    public static final String DBPASS = "123456";

    public static void main(String[] aargs){
        Statement stmt = null;
        Connection conn = null;
        try{
            // 注册 JDBC 驱动
            // 把Driver类装载进jvm
            Class.forName(DBDRIVER);
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            // 打开链接

            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);

            // 执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            String sql ="select * from goods_type";
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            System.out.println(rs.getString(1));



        }catch(SQLException e ){
            e.printStackTrace();
        }
        System.out.println(conn);
        try {
            stmt.close();
            conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
