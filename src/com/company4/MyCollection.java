package com.company4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Program: test
 * @ClassName: MyCollection
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-01 10:30
 * @Version: V1.0
 */
public class MyCollection {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.removeIf(
                (String s)->{return s.length() ==1;}
        );
        System.out.println(list);
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for(String s:list){
            System.out.println(s);
        }

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Object> list3 = new ArrayList<>();
        printList(list1);
        printList(list2);

        method1(list2);
        method2(list3);

    }

    /*<? extends Number> 参数只能是number和number所有的子类*/
    private static void method1(ArrayList<? extends Number> list) {
    }


    /*<? super Number> 参数只能是number和number所有的父类*/
    private static void method2(ArrayList<? super Number> list) {
    }
    private static void printList(ArrayList<?> list) {
    }

}
