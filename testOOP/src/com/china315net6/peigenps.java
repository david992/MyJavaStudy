package com.china315net6;

import java.util.Scanner;

/**
 * @Program: test
 * @ClassName: peigenps
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-12 11:25
 * @Version: V1.0
 */
public class peigenps extends Pizza {
    String name;
    public peigenps(String name) {
        super.name = name;
    }

    public double make(){
        System.out.println("请输入培根克数：");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
}
