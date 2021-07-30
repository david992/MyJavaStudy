package com.test;

import com.test.util.JedisUtils;
import redis.clients.jedis.Jedis;

import java.sql.*;
import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: JedisTest
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-30 15:26
 * @Version: V1.0
 */
public class JedisTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Jdbc();

        //1.获取连接对象
        //Jedis jedis = new Jedis("127.0.0.1", 6379);
        Jedis jedis = JedisUtils.getJedis();
        //2.执行操作
        jedis.set("name","david");
        System.out.println(jedis.get("name"));
        jedis.lpush("list1","a","b","c","c");
        jedis.lpop("list1");
        List<String> list1 = jedis.lrange("list1", 0, -1);
        for (String s : list1) {
            System.out.println(s);
        }
        //3.关闭连接
        jedis.close();
    }

    private static void Jdbc() throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接对象
        Connection conn = DriverManager.getConnection("jdbc://localhost:3306/fruit",
                "root", "123456");
        //3.执行操作
        Statement stmt = conn.createStatement();
        String sqp = "select * from student";
        ResultSet rs = stmt.executeQuery(sqp);
        while (rs.next()) {
            System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t" + rs.getString("age"));
        }
        //4.释放资源
        stmt.close();
        conn.close();
    }
}