package com.china315net2;

/**
 * @Program: test
 * @ClassName: test
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-04-30 16:36
 * @Version: V1.0
 */
public class test {
    public static void main(String[] args) {
        girl na = new girl();
        //  cat c = new cat();
        //  dog d = new dog();

        //  animals  pp= d;//子类转换成父类
        //  d.eat();//d是子类dog

        animals pp =petStore.getAnimal("猫");
        na.play(pp);

        // pp.eat(); 父类没有eat方法
        dog a =(dog) pp;//pp转换成子类 子类有eat
        a.eat();
    }
}
