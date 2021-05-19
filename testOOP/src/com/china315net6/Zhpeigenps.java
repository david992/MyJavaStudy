package com.china315net6;

import java.util.Scanner;

/**
 * @Program: test
 * @ClassName: Zhpeigenps
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-13 17:47
 * @Version: V1.0
 */
public class Zhpeigenps extends Pizza{
    String name;
    public Zhpeigenps(String name) {
        super.name = name;
    }

    public double make(){
        System.out.println("请输入培根克数：");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
}
