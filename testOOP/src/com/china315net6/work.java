package com.china315net6;

import java.util.Scanner;

/**
 * @Program: test
 * @ClassName: work
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-12 18:20
 * @Version: V1.0
 */
public class work {

    public static void main(String[] args) {
//        {
//            System.out.println("请选择想要的披萨（1.培根披萨2.海鲜披萨）");
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            //fectory fe = new fectory();
//            //pizza pz1= fe.CreatePizza(n);
//            Pizza pz = SimplePizzaFectory.CreatePizza(n);
//
//            pz.display();
//            if (n == 1) {
//                double b = ((peigenps) pz).make();
//                System.out.print(b + ",");
//
//            } else if (n == 2) {
//                String b = ((fruitps) pz).make();
//                System.out.print(b + ",");
//            }
//            System.out.println(pz.price + "," + pz.size + "," + pz.name + ",");
//
//        }
        {
            //创建两个不同的店
            PizzaStore nypz = new NYPizzaStore();
            PizzaStore zhpz = new ZHPizzaStore();

            Pizza pz = nypz.orderPizza(1);
            pz.display();
            System.out.println("披萨名称："+pz.getName()+"，披萨价格"+pz.price+"，披萨大小"+pz.size);

            pz = zhpz.orderPizza(2);
            pz.display();
            System.out.println("披萨名称："+pz.getName()+"，披萨价格"+pz.price+"，披萨大小"+pz.size);
        }
    }

}
