package com.china315net;

/**
 * @Program: test
 * @ClassName: Test
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-04-28 15:42
 * @Version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        Human p = (Human)stu;

        stu.setName("david");
        stu.setAge(18);
        stu.setHeight(180);
        stu.Study();

        p.setName("dva");
        p.setAge(28);
        p.setHeight(220);
        System.out.println(stu.getHeight());
        System.out.println(p.getHeight());
    }
}
