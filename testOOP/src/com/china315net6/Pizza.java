package com.china315net6;

import java.util.Scanner;

/**
 * @Program: test
 * @ClassName: piza
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-12 11:26
 * @Version: V1.0
 */
public abstract class Pizza {
    String name;
    double price;
    double size;
    public void show(){
        System.out.println("piza");
    }

    public Pizza(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pizza() {
    }
    public void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入披萨大小");
        size = sc.nextInt();
        System.out.println("请输入披萨价格");
        price = sc.nextDouble();
    }

    public void prepare() {
        System.out.println("准备");
    }

    public void bake() {
        System.out.println("烘烤");
    }

    public void cut() {
        System.out.println("切片");
    }

    public void box() {
        System.out.println("打包");
    }
}
