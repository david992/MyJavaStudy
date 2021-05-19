package com.china315net6;

import com.china315net3.Person;

import java.util.Scanner;

/**
 * @Program: test
 * @ClassName: Nyfruitps
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-13 17:48
 * @Version: V1.0
 */
public class Nyfruitps extends Pizza {
    String name;

    public Nyfruitps(String name) {
        super.name = name;
    }

    public String make(){
        System.out.println("请输入配料信息：");
        Scanner sc = new Scanner(System.in);
        String peiliao = sc.next();
        return peiliao;
    }
}
