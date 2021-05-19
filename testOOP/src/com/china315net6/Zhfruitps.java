package com.china315net6;

import java.util.Scanner;

/**
 * @Program: test
 * @ClassName: Zhfruitps
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-13 17:46
 * @Version: V1.0
 */
public class Zhfruitps extends Pizza {
    String name;

    public Zhfruitps(String name) {
        super.name = name;
    }

    public String make(){
        System.out.println("请输入配料信息：");
        Scanner sc = new Scanner(System.in);
        String peiliao = sc.next();
        return peiliao;
    }
}
