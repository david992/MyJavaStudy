package com.china315net6;

/**
 * @Program: test
 * @ClassName: ZHPizza
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-13 16:45
 * @Version: V1.0
 */
public class ZHPizza extends Pizza{
    //中国披萨自己的信息
    public ZHPizza(){
        name="中国 pizza";
        price= 998.0;
        size=12.0;
    }


    public void cut(){
        System.out.println("---切成正方形---");
    }
}
