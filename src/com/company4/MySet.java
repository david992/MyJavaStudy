package com.company4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Program: test
 * @ClassName: MySet
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-01 14:47
 * @Version: V1.0
 */
public class MySet {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("sss");
        set.add("s");
        set.add("s");
        set.add("ss");
        set.add("ssss");
        System.out.println(set);
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
