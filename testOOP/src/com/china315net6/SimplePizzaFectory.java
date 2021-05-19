package com.china315net6;

/**
 * @Program: test
 * @ClassName: fectory
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-12 19:13
 * @Version: V1.0
 */
public class SimplePizzaFectory {
    //简单工厂  创建披萨
    public static Pizza CreatePizza(int num){
        //static内部不能调用非static方法
        eat();
        Pizza pz=null;
        switch (num){
            case 1: {
                pz =new peigenps("培根披萨");
            }
            case 2: {
                pz = new fruitps("海鲜披萨");

            }

        }
        return pz;
    }
    public static void eat(){

    }
}
