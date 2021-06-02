package com.company4;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Program: test
 * @ClassName: MyDate
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-31 14:02
 * @Version: V1.0
 */
public class MyDate {
    public static void main(String[] args) {
        System.out.println(new Date());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));
        System.out.println("***************************");


        System.out.println(LocalDateTime.now());
        LocalDateTime localDateTime = LocalDateTime.of(2021, 11, 11, 11, 11, 11);
        System.out.println("年："+localDateTime.getYear());
        System.out.println("月："+localDateTime.getMonthValue());
        System.out.println("月："+localDateTime.getMonth());
        System.out.println("一年中："+localDateTime.getDayOfYear());
        System.out.println("星期："+localDateTime.getDayOfWeek());
        System.out.println("分钟："+localDateTime.getMinute());
        System.out.println("秒："+localDateTime.getSecond());
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String s = localDateTime.format(pattern);
        System.out.println(s);
        //解析为LocalDateTime对象
        System.out.println(LocalDateTime.parse(s,pattern));

    }
}
