package com.china315net2;

/**
 * @Program: test
 * @ClassName: petStore
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-08 11:44
 * @Version: V1.0
 */
public class petStore {
    public static animals getAnimal(String petname) {
        animals an = null;
        switch (petname){
            // petname.equals("猫"); //容易空指针异常
            case "猫":an = new cat();
            case "狗":an = new dog();
            default: an = null;
        }
        return  an;

    }
}
