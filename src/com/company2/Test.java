package com.company2;

/**
 * @Program: test
 * @ClassName: Test
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-04-28 09:43
 * @Version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person(12,"dva",196.2);
        p.speak();
        p.setWeight(101);
        System.out.print(p.getWeight());
        System.out.print("-----------------------");
        Person p2 = new Person(12,"dva","女");
        p2.speak();
        System.out.print(p2.getSex());

    }
}
