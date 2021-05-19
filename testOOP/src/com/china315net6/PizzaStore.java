package com.china315net6;

/**
 * @Program: test
 * @ClassName: PizzaStore
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-13 11:42
 * @Version: V1.0
 */
public abstract class PizzaStore {
//    SimplePizzaFectory factory;
//    public PizzaStore(SimplePizzaFectory factory){
//        this.factory = factory;
//    }

    public Pizza orderPizza( int num){
        Pizza pz;

        //通过传入类型调用工厂创建披萨
        pz = createPizza(num);

        pz.prepare();
        pz.bake();
        pz.cut();
        pz.box();
        return pz;
    }
    //抽象类方法
    //将工厂对象移动到这个方法里，不同的工厂有自己不同的方法
    abstract Pizza createPizza(int num);
}
