package com.china315net5;

/**
 * @Program: test
 * @ClassName: TestOuter
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-11 15:02
 * @Version: V1.0
 */
public class TestOuter {
    int age;
    static int sex;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void method(){
        int sum=99;
        //局部类中访问的变量必须是被final修饰的
        class A{
            public void a(){
                System.out.println(sum);
            }
        }
    }
    //如果类B在整个项目中只试用一次  则没必要单独创建类  创建内部类就可以了
    public Comparable method2(){
        class B implements Comparable{
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new B();
    }
    public Comparable method3(){
        //匿名内部类
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };

    }
    public void a (){
        System.out.println("aaaaaaaaaaa");
        {
            System.out.println("普通快");
        }
        //外部类访问内部类 通过对象访问
        D d = new D();
        d.method();
    }
    static {
        System.out.println("静态块");
    }
    public  TestOuter(){
    }

    public TestOuter(int age) {
        this.age = age;
    }
    //非静态方法成员内部类
    public  class D{
        int age=20;
        String name ;
        public void method(){
            int age=30;
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(TestOuter.this.age);
        }
    }
    //静态成员内部类
    static class E{
        public void method(){
            //静态内部类中只能访问外部类中被static修饰的内容
            System.out.println(sex);
        }
    }


static class Demo{
    public static void main(String[] args) {
        TestOuter to= new TestOuter();
        to.a();
        //静态成员内部类创建对象
        TestOuter.E e = new TestOuter.E();
        //静态成员内部类创建对象
        TestOuter t = new TestOuter();
        TestOuter.D d = t.new D();
        d.method();
    }
}
}
