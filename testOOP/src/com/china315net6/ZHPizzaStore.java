package com.china315net6;

/**
 * @Program: test
 * @ClassName: ZHPizzaStore
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-13 16:04
 * @Version: V1.0
 */
public class ZHPizzaStore extends PizzaStore{
    Pizza createPizza( int num ){
        Pizza pz=null;

        switch (num){
            case 1: {
                pz =new Zhpeigenps("中国培根披萨");
            }
            case 2: {
                pz = new Zhfruitps("中国海鲜披萨");
            }

        }
        return pz;

    }
}
