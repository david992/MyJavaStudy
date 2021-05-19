package com.china315net6;

/**
 * @Program: test
 * @ClassName: NYPizzaStore
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-13 15:57
 * @Version: V1.0
 */
public class NYPizzaStore extends PizzaStore{
    //创建纽约披萨店
    Pizza createPizza( int num ){
        Pizza pz=null;

        switch (num){
            case 1: {
                pz = new Nypeigenps("纽约培根披萨");
            }
            case 2: {
                pz = new Nyfruitps("纽约海鲜披萨");

            }

        }
        return pz;
    }
}
